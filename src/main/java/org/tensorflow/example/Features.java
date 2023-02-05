// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: feature.proto

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.Features}
 */
public final class Features extends
        com.google.protobuf.GeneratedMessageV3 implements
        // @@protoc_insertion_point(message_implements:tensorflow.Features)
        FeaturesOrBuilder {
    private static final long serialVersionUID = 0L;

    // Use Features.newBuilder() to construct.
    private Features(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Features() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
            UnusedPrivateParameter unused) {
        return new Features();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return this.unknownFields;
    }

    private Features(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
        }
        int mutable_bitField0_ = 0;
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                com.google.protobuf.UnknownFieldSet.newBuilder();
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    case 10: {
                        if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                            feature_ = com.google.protobuf.MapField.newMapField(
                                    FeatureDefaultEntryHolder.defaultEntry);
                            mutable_bitField0_ |= 0x00000001;
                        }
                        com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.example.Feature>
                                feature__ = input.readMessage(
                                FeatureDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                        feature_.getMutableMap().put(
                                feature__.getKey(), feature__.getValue());
                        break;
                    }
                    default: {
                        if (!parseUnknownField(
                                input, unknownFields, extensionRegistry, tag)) {
                            done = true;
                        }
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            this.unknownFields = unknownFields.build();
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
            int number) {
        switch (number) {
            case 1:
                return internalGetFeature();
            default:
                throw new RuntimeException(
                        "Invalid map field number: " + number);
        }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
        return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        org.tensorflow.example.Features.class, org.tensorflow.example.Features.Builder.class);
    }

    public static final int FEATURE_FIELD_NUMBER = 1;

    private static final class FeatureDefaultEntryHolder {
        static final com.google.protobuf.MapEntry<
                java.lang.String, org.tensorflow.example.Feature> defaultEntry =
                com.google.protobuf.MapEntry
                        .<java.lang.String, org.tensorflow.example.Feature>newDefaultInstance(
                                org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_FeatureEntry_descriptor,
                                com.google.protobuf.WireFormat.FieldType.STRING,
                                "",
                                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                                org.tensorflow.example.Feature.getDefaultInstance());
    }

    private com.google.protobuf.MapField<
            java.lang.String, org.tensorflow.example.Feature> feature_;

    private com.google.protobuf.MapField<java.lang.String, org.tensorflow.example.Feature>
    internalGetFeature() {
        if (feature_ == null) {
            return com.google.protobuf.MapField.emptyMapField(
                    FeatureDefaultEntryHolder.defaultEntry);
        }
        return feature_;
    }

    public int getFeatureCount() {
        return internalGetFeature().getMap().size();
    }

    /**
     * <pre>
     * Map from feature name to feature.
     * </pre>
     *
     * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
     */

    @java.lang.Override
    public boolean containsFeature(
            java.lang.String key) {
        if (key == null) {
            throw new NullPointerException("map key");
        }
        return internalGetFeature().getMap().containsKey(key);
    }

    /**
     * Use {@link #getFeatureMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, org.tensorflow.example.Feature> getFeature() {
        return getFeatureMap();
    }

    /**
     * <pre>
     * Map from feature name to feature.
     * </pre>
     *
     * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, org.tensorflow.example.Feature> getFeatureMap() {
        return internalGetFeature().getMap();
    }

    /**
     * <pre>
     * Map from feature name to feature.
     * </pre>
     *
     * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
     */
    @java.lang.Override

    public org.tensorflow.example.Feature getFeatureOrDefault(
            java.lang.String key,
            org.tensorflow.example.Feature defaultValue) {
        if (key == null) {
            throw new NullPointerException("map key");
        }
        java.util.Map<java.lang.String, org.tensorflow.example.Feature> map =
                internalGetFeature().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
    }

    /**
     * <pre>
     * Map from feature name to feature.
     * </pre>
     *
     * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
     */
    @java.lang.Override

    public org.tensorflow.example.Feature getFeatureOrThrow(
            java.lang.String key) {
        if (key == null) {
            throw new NullPointerException("map key");
        }
        java.util.Map<java.lang.String, org.tensorflow.example.Feature> map =
                internalGetFeature().getMap();
        if (!map.containsKey(key)) {
            throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
    }

    private byte memoizedIsInitialized = -1;

    @java.lang.Override
    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        com.google.protobuf.GeneratedMessageV3
                .serializeStringMapTo(
                        output,
                        internalGetFeature(),
                        FeatureDefaultEntryHolder.defaultEntry,
                        1);
        unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        for (java.util.Map.Entry<java.lang.String, org.tensorflow.example.Feature> entry
                : internalGetFeature().getMap().entrySet()) {
            com.google.protobuf.MapEntry<java.lang.String, org.tensorflow.example.Feature>
                    feature__ = FeatureDefaultEntryHolder.defaultEntry.newBuilderForType()
                    .setKey(entry.getKey())
                    .setValue(entry.getValue())
                    .build();
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(1, feature__);
        }
        size += unknownFields.getSerializedSize();
        memoizedSize = size;
        return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof org.tensorflow.example.Features)) {
            return super.equals(obj);
        }
        org.tensorflow.example.Features other = (org.tensorflow.example.Features) obj;

        if (!internalGetFeature().equals(
                other.internalGetFeature())) return false;
        if (!unknownFields.equals(other.unknownFields)) return false;
        return true;
    }

    @java.lang.Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptor().hashCode();
        if (!internalGetFeature().getMap().isEmpty()) {
            hash = (37 * hash) + FEATURE_FIELD_NUMBER;
            hash = (53 * hash) + internalGetFeature().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static org.tensorflow.example.Features parseFrom(
            java.nio.ByteBuffer data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.example.Features parseFrom(
            java.nio.ByteBuffer data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.example.Features parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.example.Features parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.example.Features parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static org.tensorflow.example.Features parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static org.tensorflow.example.Features parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.tensorflow.example.Features parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.tensorflow.example.Features parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.tensorflow.example.Features parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.tensorflow.example.Features parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static org.tensorflow.example.Features parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(org.tensorflow.example.Features prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    @java.lang.Override
    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
            com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * Protobuf type {@code tensorflow.Features}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:tensorflow.Features)
            org.tensorflow.example.FeaturesOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_descriptor;
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapField internalGetMapField(
                int number) {
            switch (number) {
                case 1:
                    return internalGetFeature();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @SuppressWarnings({"rawtypes"})
        protected com.google.protobuf.MapField internalGetMutableMapField(
                int number) {
            switch (number) {
                case 1:
                    return internalGetMutableFeature();
                default:
                    throw new RuntimeException(
                            "Invalid map field number: " + number);
            }
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            org.tensorflow.example.Features.class, org.tensorflow.example.Features.Builder.class);
        }

        // Construct using org.tensorflow.example.Features.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        @java.lang.Override
        public Builder clear() {
            super.clear();
            internalGetMutableFeature().clear();
            return this;
        }

        @java.lang.Override
        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return org.tensorflow.example.FeatureProtos.internal_static_tensorflow_Features_descriptor;
        }

        @java.lang.Override
        public org.tensorflow.example.Features getDefaultInstanceForType() {
            return org.tensorflow.example.Features.getDefaultInstance();
        }

        @java.lang.Override
        public org.tensorflow.example.Features build() {
            org.tensorflow.example.Features result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        @java.lang.Override
        public org.tensorflow.example.Features buildPartial() {
            org.tensorflow.example.Features result = new org.tensorflow.example.Features(this);
            int from_bitField0_ = bitField0_;
            result.feature_ = internalGetFeature();
            result.feature_.makeImmutable();
            onBuilt();
            return result;
        }

        @java.lang.Override
        public Builder clone() {
            return super.clone();
        }

        @java.lang.Override
        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.setField(field, value);
        }

        @java.lang.Override
        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return super.clearField(field);
        }

        @java.lang.Override
        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return super.clearOneof(oneof);
        }

        @java.lang.Override
        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, java.lang.Object value) {
            return super.setRepeatedField(field, index, value);
        }

        @java.lang.Override
        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                java.lang.Object value) {
            return super.addRepeatedField(field, value);
        }

        @java.lang.Override
        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof org.tensorflow.example.Features) {
                return mergeFrom((org.tensorflow.example.Features) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(org.tensorflow.example.Features other) {
            if (other == org.tensorflow.example.Features.getDefaultInstance()) return this;
            internalGetMutableFeature().mergeFrom(
                    other.internalGetFeature());
            this.mergeUnknownFields(other.unknownFields);
            onChanged();
            return this;
        }

        @java.lang.Override
        public final boolean isInitialized() {
            return true;
        }

        @java.lang.Override
        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            org.tensorflow.example.Features parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (org.tensorflow.example.Features) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private com.google.protobuf.MapField<
                java.lang.String, org.tensorflow.example.Feature> feature_;

        private com.google.protobuf.MapField<java.lang.String, org.tensorflow.example.Feature>
        internalGetFeature() {
            if (feature_ == null) {
                return com.google.protobuf.MapField.emptyMapField(
                        FeatureDefaultEntryHolder.defaultEntry);
            }
            return feature_;
        }

        private com.google.protobuf.MapField<java.lang.String, org.tensorflow.example.Feature>
        internalGetMutableFeature() {
            onChanged();
            ;
            if (feature_ == null) {
                feature_ = com.google.protobuf.MapField.newMapField(
                        FeatureDefaultEntryHolder.defaultEntry);
            }
            if (!feature_.isMutable()) {
                feature_ = feature_.copy();
            }
            return feature_;
        }

        public int getFeatureCount() {
            return internalGetFeature().getMap().size();
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */

        @java.lang.Override
        public boolean containsFeature(
                java.lang.String key) {
            if (key == null) {
                throw new NullPointerException("map key");
            }
            return internalGetFeature().getMap().containsKey(key);
        }

        /**
         * Use {@link #getFeatureMap()} instead.
         */
        @java.lang.Override
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, org.tensorflow.example.Feature> getFeature() {
            return getFeatureMap();
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */
        @java.lang.Override

        public java.util.Map<java.lang.String, org.tensorflow.example.Feature> getFeatureMap() {
            return internalGetFeature().getMap();
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */
        @java.lang.Override

        public org.tensorflow.example.Feature getFeatureOrDefault(
                java.lang.String key,
                org.tensorflow.example.Feature defaultValue) {
            if (key == null) {
                throw new NullPointerException("map key");
            }
            java.util.Map<java.lang.String, org.tensorflow.example.Feature> map =
                    internalGetFeature().getMap();
            return map.containsKey(key) ? map.get(key) : defaultValue;
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */
        @java.lang.Override

        public org.tensorflow.example.Feature getFeatureOrThrow(
                java.lang.String key) {
            if (key == null) {
                throw new NullPointerException("map key");
            }
            java.util.Map<java.lang.String, org.tensorflow.example.Feature> map =
                    internalGetFeature().getMap();
            if (!map.containsKey(key)) {
                throw new java.lang.IllegalArgumentException();
            }
            return map.get(key);
        }

        public Builder clearFeature() {
            internalGetMutableFeature().getMutableMap()
                    .clear();
            return this;
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */

        public Builder removeFeature(
                java.lang.String key) {
            if (key == null) {
                throw new NullPointerException("map key");
            }
            internalGetMutableFeature().getMutableMap()
                    .remove(key);
            return this;
        }

        /**
         * Use alternate mutation accessors instead.
         */
        @java.lang.Deprecated
        public java.util.Map<java.lang.String, org.tensorflow.example.Feature>
        getMutableFeature() {
            return internalGetMutableFeature().getMutableMap();
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */
        public Builder putFeature(
                java.lang.String key,
                org.tensorflow.example.Feature value) {
            if (key == null) {
                throw new NullPointerException("map key");
            }
            if (value == null) {
                throw new NullPointerException("map value");
            }

            internalGetMutableFeature().getMutableMap()
                    .put(key, value);
            return this;
        }

        /**
         * <pre>
         * Map from feature name to feature.
         * </pre>
         *
         * <code>map&lt;string, .tensorflow.Feature&gt; feature = 1;</code>
         */

        public Builder putAllFeature(
                java.util.Map<java.lang.String, org.tensorflow.example.Feature> values) {
            internalGetMutableFeature().getMutableMap()
                    .putAll(values);
            return this;
        }

        @java.lang.Override
        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.setUnknownFields(unknownFields);
        }

        @java.lang.Override
        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return super.mergeUnknownFields(unknownFields);
        }


        // @@protoc_insertion_point(builder_scope:tensorflow.Features)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.Features)
    private static final org.tensorflow.example.Features DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new org.tensorflow.example.Features();
    }

    public static org.tensorflow.example.Features getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Features>
            PARSER = new com.google.protobuf.AbstractParser<Features>() {
        @java.lang.Override
        public Features parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Features(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Features> parser() {
        return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Features> getParserForType() {
        return PARSER;
    }

    @java.lang.Override
    public org.tensorflow.example.Features getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

