// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: feature.proto

package org.tensorflow.example;

public interface FeatureOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.Feature)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   * @return Whether the bytesList field is set.
   */
  boolean hasBytesList();
  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   * @return The bytesList.
   */
  org.tensorflow.example.BytesList getBytesList();
  /**
   * <code>.tensorflow.BytesList bytes_list = 1;</code>
   */
  org.tensorflow.example.BytesListOrBuilder getBytesListOrBuilder();

  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   * @return Whether the floatList field is set.
   */
  boolean hasFloatList();
  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   * @return The floatList.
   */
  org.tensorflow.example.FloatList getFloatList();
  /**
   * <code>.tensorflow.FloatList float_list = 2;</code>
   */
  org.tensorflow.example.FloatListOrBuilder getFloatListOrBuilder();

  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   * @return Whether the int64List field is set.
   */
  boolean hasInt64List();
  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   * @return The int64List.
   */
  org.tensorflow.example.Int64List getInt64List();
  /**
   * <code>.tensorflow.Int64List int64_list = 3;</code>
   */
  org.tensorflow.example.Int64ListOrBuilder getInt64ListOrBuilder();

  public org.tensorflow.example.Feature.KindCase getKindCase();
}
