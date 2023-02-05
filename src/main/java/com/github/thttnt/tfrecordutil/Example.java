package com.github.thttnt.tfrecordutil;

import com.google.protobuf.ByteString;
import org.tensorflow.example.*;

import java.util.*;

/**
 * @author HaotianTu
 * create at 2023/2/6
 **/
public class Example {

    private Map<String, Object> features = new HashMap<>();

    public void setFeature(String name, Object value) {
        this.features.put(name, value);
    }

    public org.tensorflow.example.Example build() {
        Features.Builder featuresBuilder = Features.newBuilder();
        for (Map.Entry<String, Object> entry : features.entrySet()) {
            Feature.Builder featureBuilder = Feature.newBuilder();
            if (entry.getValue() instanceof String stringValue) {
                BytesList.Builder bytesListBuilder = BytesList.newBuilder();
                bytesListBuilder.addValue(ByteString.copyFrom(stringValue.getBytes()));
                featureBuilder.setBytesList(bytesListBuilder.build());
            } else if (entry.getValue() instanceof Integer intValue) {
                Int64List.Builder int64ListBuilder = Int64List.newBuilder();
                int64ListBuilder.addValue(intValue.longValue());
                featureBuilder.setInt64List(int64ListBuilder.build());
            } else if (entry.getValue() instanceof Long longValue) {
                Int64List.Builder int64ListBuilder = Int64List.newBuilder();
                int64ListBuilder.addValue(longValue);
                featureBuilder.setInt64List(int64ListBuilder.build());
            } else if (entry.getValue() instanceof Float floatValue) {
                FloatList.Builder floatListBuilder = FloatList.newBuilder();
                floatListBuilder.addValue(floatValue);
                featureBuilder.setFloatList(floatListBuilder.build());
            } else if (entry.getValue() instanceof Double doubleValue) {
                FloatList.Builder floatListBuilder = FloatList.newBuilder();
                floatListBuilder.addValue(doubleValue.floatValue());
                featureBuilder.setFloatList(floatListBuilder.build());
            } else if (entry.getValue() instanceof Boolean booleanValue) {
                Int64List.Builder boolListBuilder = Int64List.newBuilder();
                boolListBuilder.addValue(booleanValue.booleanValue() ? 1L : 0L);
                featureBuilder.setInt64List(boolListBuilder.build());
            } else if (entry.getValue() instanceof byte[] byteArray) {
                BytesList.Builder bytesListBuilder = BytesList.newBuilder();
                bytesListBuilder.addAllValue(Collections.singleton(ByteString.copyFrom(byteArray)));
                featureBuilder.setBytesList(bytesListBuilder.build());
            } else if (entry.getValue() instanceof int[] intArray) {
                Int64List.Builder int64ListBuilder = Int64List.newBuilder();
                for (int i : intArray) {
                    int64ListBuilder.addValue(i);
                }
                featureBuilder.setInt64List(int64ListBuilder.build());
            } else if (entry.getValue() instanceof long[] longArray) {
                Int64List.Builder int64ListBuilder = Int64List.newBuilder();
                for (long i : longArray) {
                    int64ListBuilder.addValue(i);
                }
                featureBuilder.setInt64List(int64ListBuilder.build());
            } else if (entry.getValue() instanceof float[] floatArray) {
                FloatList.Builder floatListBuilder = FloatList.newBuilder();
                for (float i : floatArray) {
                    floatListBuilder.addValue(i);
                }
                featureBuilder.setFloatList(floatListBuilder.build());
            } else if (entry.getValue() instanceof double[] doubleArray) {
                FloatList.Builder floatListBuilder = FloatList.newBuilder();
                for (double i : doubleArray) {
                    floatListBuilder.addValue((float) i);
                }
                featureBuilder.setFloatList(floatListBuilder.build());
            } else if (entry.getValue() instanceof boolean[] booleanArray) {
                Int64List.Builder int64ListBuilder = Int64List.newBuilder();
                for (boolean i : booleanArray) {
                    int64ListBuilder.addValue(i ? 1L : 0L);
                }
                featureBuilder.setInt64List(int64ListBuilder.build());
            } else if (entry.getValue() instanceof String[] stringArray) {
                BytesList.Builder bytesListBuilder = BytesList.newBuilder();
                for (String i : stringArray) {
                    bytesListBuilder.addValue(ByteString.copyFrom(i.getBytes()));
                }
                featureBuilder.setBytesList(bytesListBuilder.build());
            } else {
                throw new RuntimeException("Unsupported type: " + entry.getValue().getClass().getName());
            }
            featuresBuilder.putFeature(entry.getKey(), featureBuilder.build());
        }
        org.tensorflow.example.Example.Builder exampleBuilder = org.tensorflow.example.Example.newBuilder();
        exampleBuilder.setFeatures(featuresBuilder.build());
        return exampleBuilder.build();
    }
}
