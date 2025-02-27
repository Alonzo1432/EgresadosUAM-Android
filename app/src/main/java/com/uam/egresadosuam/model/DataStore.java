// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataStore.proto

package com.uam.egresadosuam.model;

public final class DataStore {
    static {
    }

    private DataStore() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public interface UserCredentialsOrBuilder extends
            // @@protoc_insertion_point(interface_extends:UserCredentials)
            com.google.protobuf.MessageLiteOrBuilder {

        /**
         * <code>string jwt = 1;</code>
         *
         * @return The jwt.
         */
        java.lang.String getJwt();

        /**
         * <code>string jwt = 1;</code>
         *
         * @return The bytes for jwt.
         */
        com.google.protobuf.ByteString
        getJwtBytes();
    }

    /**
     * Protobuf type {@code UserCredentials}
     */
    public static final class UserCredentials extends
            com.google.protobuf.GeneratedMessageLite<
                    UserCredentials, UserCredentials.Builder> implements
            // @@protoc_insertion_point(message_implements:UserCredentials)
            UserCredentialsOrBuilder {
        public static final int JWT_FIELD_NUMBER = 1;
        // @@protoc_insertion_point(class_scope:UserCredentials)
        private static final DataStore.UserCredentials DEFAULT_INSTANCE;
        private static volatile com.google.protobuf.Parser<UserCredentials> PARSER;

        static {
            UserCredentials defaultInstance = new UserCredentials();
            // New instances are implicitly immutable so no need to make
            // immutable.
            DEFAULT_INSTANCE = defaultInstance;
            com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
                    UserCredentials.class, defaultInstance);
        }

        private java.lang.String jwt_;

        private UserCredentials() {
            jwt_ = "";
        }

        public static DataStore.UserCredentials parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data);
        }

        public static DataStore.UserCredentials parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DataStore.UserCredentials parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data);
        }

        public static DataStore.UserCredentials parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DataStore.UserCredentials parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data);
        }

        public static DataStore.UserCredentials parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DataStore.UserCredentials parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input);
        }

        public static DataStore.UserCredentials parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DataStore.UserCredentials parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DataStore.UserCredentials parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DataStore.UserCredentials parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input);
        }

        public static DataStore.UserCredentials parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageLite.parseFrom(
                    DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DataStore.UserCredentials prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DataStore.UserCredentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.google.protobuf.Parser<UserCredentials> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /**
         * <code>string jwt = 1;</code>
         *
         * @return The jwt.
         */
        @java.lang.Override
        public java.lang.String getJwt() {
            return jwt_;
        }

        /**
         * <code>string jwt = 1;</code>
         *
         * @param value The jwt to set.
         */
        private void setJwt(
                java.lang.String value) {
            java.lang.Class<?> valueClass = value.getClass();

            jwt_ = value;
        }

        /**
         * <code>string jwt = 1;</code>
         *
         * @return The bytes for jwt.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getJwtBytes() {
            return com.google.protobuf.ByteString.copyFromUtf8(jwt_);
        }

        /**
         * <code>string jwt = 1;</code>
         *
         * @param value The bytes for jwt to set.
         */
        private void setJwtBytes(
                com.google.protobuf.ByteString value) {
            checkByteStringIsUtf8(value);
            jwt_ = value.toStringUtf8();

        }

        /**
         * <code>string jwt = 1;</code>
         */
        private void clearJwt() {

            jwt_ = getDefaultInstance().getJwt();
        }

        @java.lang.Override
        @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
        protected java.lang.Object dynamicMethod(
                com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
                java.lang.Object arg0, java.lang.Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE: {
                    return new DataStore.UserCredentials();
                }
                case NEW_BUILDER: {
                    return new Builder();
                }
                case BUILD_MESSAGE_INFO: {
                    java.lang.Object[] objects = new java.lang.Object[]{
                            "jwt_",
                    };
                    java.lang.String info =
                            "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
                    return newMessageInfo(DEFAULT_INSTANCE, info, objects);
                }
                // fall through
                case GET_DEFAULT_INSTANCE: {
                    return DEFAULT_INSTANCE;
                }
                case GET_PARSER: {
                    com.google.protobuf.Parser<DataStore.UserCredentials> parser = PARSER;
                    if (parser == null) {
                        synchronized (DataStore.UserCredentials.class) {
                            parser = PARSER;
                            if (parser == null) {
                                parser =
                                        new DefaultInstanceBasedParser<DataStore.UserCredentials>(
                                                DEFAULT_INSTANCE);
                                PARSER = parser;
                            }
                        }
                    }
                    return parser;
                }
                case GET_MEMOIZED_IS_INITIALIZED: {
                    return (byte) 1;
                }
                case SET_MEMOIZED_IS_INITIALIZED: {
                    return null;
                }
            }
            throw new UnsupportedOperationException();
        }

        /**
         * Protobuf type {@code UserCredentials}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageLite.Builder<
                        DataStore.UserCredentials, Builder> implements
                // @@protoc_insertion_point(builder_implements:UserCredentials)
                DataStore.UserCredentialsOrBuilder {
            // Construct using com.uam.egresadosuam.model.DataStore.UserCredentials.newBuilder()
            private Builder() {
                super(DEFAULT_INSTANCE);
            }


            /**
             * <code>string jwt = 1;</code>
             *
             * @return The jwt.
             */
            @java.lang.Override
            public java.lang.String getJwt() {
                return instance.getJwt();
            }

            /**
             * <code>string jwt = 1;</code>
             *
             * @param value The jwt to set.
             * @return This builder for chaining.
             */
            public Builder setJwt(
                    java.lang.String value) {
                copyOnWrite();
                instance.setJwt(value);
                return this;
            }

            /**
             * <code>string jwt = 1;</code>
             *
             * @return The bytes for jwt.
             */
            @java.lang.Override
            public com.google.protobuf.ByteString
            getJwtBytes() {
                return instance.getJwtBytes();
            }

            /**
             * <code>string jwt = 1;</code>
             *
             * @param value The bytes for jwt to set.
             * @return This builder for chaining.
             */
            public Builder setJwtBytes(
                    com.google.protobuf.ByteString value) {
                copyOnWrite();
                instance.setJwtBytes(value);
                return this;
            }

            /**
             * <code>string jwt = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearJwt() {
                copyOnWrite();
                instance.clearJwt();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:UserCredentials)
        }
    }

    // @@protoc_insertion_point(outer_class_scope)
}