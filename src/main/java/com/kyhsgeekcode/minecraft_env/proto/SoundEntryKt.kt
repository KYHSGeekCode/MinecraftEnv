//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: observation_space.proto

package com.kyhsgeekcode.minecraft_env.proto;

@kotlin.jvm.JvmName("-initializesoundEntry")
public inline fun soundEntry(block: com.kyhsgeekcode.minecraft_env.proto.SoundEntryKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry =
    com.kyhsgeekcode.minecraft_env.proto.SoundEntryKt.Dsl._create(com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry.newBuilder())
        .apply { block() }._build()

public object SoundEntryKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
        private val _builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry.Builder
    ) {
        public companion object {
            @kotlin.jvm.JvmSynthetic
            @kotlin.PublishedApi
            internal fun _create(builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry.Builder): Dsl =
                Dsl(builder)
        }

        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _build(): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry = _builder.build()

        /**
         * <code>string translate_key = 1;</code>
         */
        public var translateKey: kotlin.String
            @JvmName("getTranslateKey")
            get() = _builder.getTranslateKey()
            @JvmName("setTranslateKey")
            set(value) {
                _builder.setTranslateKey(value)
            }

        /**
         * <code>string translate_key = 1;</code>
         */
        public fun clearTranslateKey() {
            _builder.clearTranslateKey()
        }

        /**
         * <code>int64 age = 2;</code>
         */
        public var age: kotlin.Long
            @JvmName("getAge")
            get() = _builder.getAge()
            @JvmName("setAge")
            set(value) {
                _builder.setAge(value)
            }

        /**
         * <code>int64 age = 2;</code>
         */
        public fun clearAge() {
            _builder.clearAge()
        }

        /**
         * <code>double x = 3;</code>
         */
        public var x: kotlin.Double
            @JvmName("getX")
            get() = _builder.getX()
            @JvmName("setX")
            set(value) {
                _builder.setX(value)
            }

        /**
         * <code>double x = 3;</code>
         */
        public fun clearX() {
            _builder.clearX()
        }

        /**
         * <code>double y = 4;</code>
         */
        public var y: kotlin.Double
            @JvmName("getY")
            get() = _builder.getY()
            @JvmName("setY")
            set(value) {
                _builder.setY(value)
            }

        /**
         * <code>double y = 4;</code>
         */
        public fun clearY() {
            _builder.clearY()
        }

        /**
         * <code>double z = 5;</code>
         */
        public var z: kotlin.Double
            @JvmName("getZ")
            get() = _builder.getZ()
            @JvmName("setZ")
            set(value) {
                _builder.setZ(value)
            }

        /**
         * <code>double z = 5;</code>
         */
        public fun clearZ() {
            _builder.clearZ()
        }
    }
}

@kotlin.jvm.JvmSynthetic
public inline fun com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry.copy(block: com.kyhsgeekcode.minecraft_env.proto.SoundEntryKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.SoundEntry =
    com.kyhsgeekcode.minecraft_env.proto.SoundEntryKt.Dsl._create(this.toBuilder()).apply { block() }._build()

