package com.github.thttnt.tfrecordutil.test;


import com.github.thttnt.tfrecordutil.Example;
import com.github.thttnt.tfrecordutil.TFRecordWriter;

import java.io.IOException;

/**
 * @author HaotianTu
 * create at 2023/2/6
 **/
public class TFRecordWriterTest {

    public static void main(String[] args) throws IOException {
        TFRecordWriter tfRecordWriter = new TFRecordWriter("test.tfrecord");
        Example example = new Example();
        example.setFeature("byte_array_test",new byte[]{1,2,3,4,5});
        example.setFeature("int_test",1);
        example.setFeature("boolean_test",false);
        tfRecordWriter.write(example);
        tfRecordWriter.close();
    }
}
