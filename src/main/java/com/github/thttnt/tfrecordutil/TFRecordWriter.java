package com.github.thttnt.tfrecordutil;

import java.io.*;
import java.util.zip.CRC32C;

/**
 * @author HaotianTu
 * create at 2023/2/6
 **/
public class TFRecordWriter implements Closeable {
    private BufferedOutputStream writer;
    private static int maskDelta = 0xa282ead8;

    private int calculateCRC(byte[] buffer, int length) {
        CRC32C crc32c = new CRC32C();
        crc32c.update(buffer, 0, length);
        long crc = crc32c.getValue();
        crc = (((crc >> 15) | (crc << 17)) + maskDelta) & 0xffffffffL;
        return (int) crc;
    }

    private void writeInt(int value) throws IOException {
        writer.write(value & 0xff);
        writer.write((value >>> 8) & 0xff);
        writer.write((value >>> 16) & 0xff);
        writer.write((value >>> 24) & 0xff);
    }

    private void writeLong(long value) throws IOException {
        writer.write((int) (value & 0xff));
        writer.write((int) ((value >>> 8) & 0xff));
        writer.write((int) ((value >>> 16) & 0xff));
        writer.write((int) ((value >>> 24) & 0xff));
        writer.write((int) ((value >>> 32) & 0xff));
        writer.write((int) ((value >>> 40) & 0xff));
        writer.write((int) ((value >>> 48) & 0xff));
        writer.write((int) ((value >>> 56) & 0xff));
    }

    private byte[] longToBytes(long value) {
        byte[] bytes = new byte[8];
        for (int i = 0; i < 8; i++) {
            bytes[i] = (byte) (value >>> (8 * i));
        }
        return bytes;
    }

    public TFRecordWriter(String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try {
            file.createNewFile();
            this.writer = new BufferedOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void write(Example example) throws IOException {
        org.tensorflow.example.Example tfExample = example.build();
        this.writeLong(tfExample.getSerializedSize());
        this.writeInt(calculateCRC(longToBytes(tfExample.getSerializedSize()), 8));
        byte[] body = tfExample.toByteArray();
        this.writer.write(body);
        this.writeInt(calculateCRC(body, body.length));
    }


    @Override
    public void close() throws IOException {
        this.writer.close();
    }
}
