//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: observation_space.proto

package com.kyhsgeekcode.minecraft_env.proto;

@kotlin.jvm.JvmName("-initializeitemStack")
public inline fun itemStack(block: com.kyhsgeekcode.minecraft_env.proto.ItemStackKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack =
  com.kyhsgeekcode.minecraft_env.proto.ItemStackKt.Dsl._create(com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack.newBuilder()).apply { block() }._build()
public object ItemStackKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack = _builder.build()

    /**
     * <code>int32 raw_id = 1;</code>
     */
    public var rawId: kotlin.Int
      @JvmName("getRawId")
      get() = _builder.getRawId()
      @JvmName("setRawId")
      set(value) {
        _builder.setRawId(value)
      }
    /**
     * <code>int32 raw_id = 1;</code>
     */
    public fun clearRawId() {
      _builder.clearRawId()
    }

    /**
     * <code>string translation_key = 2;</code>
     */
    public var translationKey: kotlin.String
      @JvmName("getTranslationKey")
      get() = _builder.getTranslationKey()
      @JvmName("setTranslationKey")
      set(value) {
        _builder.setTranslationKey(value)
      }
    /**
     * <code>string translation_key = 2;</code>
     */
    public fun clearTranslationKey() {
      _builder.clearTranslationKey()
    }

    /**
     * <code>int32 count = 3;</code>
     */
    public var count: kotlin.Int
      @JvmName("getCount")
      get() = _builder.getCount()
      @JvmName("setCount")
      set(value) {
        _builder.setCount(value)
      }
    /**
     * <code>int32 count = 3;</code>
     */
    public fun clearCount() {
      _builder.clearCount()
    }

    /**
     * <code>int32 durability = 4;</code>
     */
    public var durability: kotlin.Int
      @JvmName("getDurability")
      get() = _builder.getDurability()
      @JvmName("setDurability")
      set(value) {
        _builder.setDurability(value)
      }
    /**
     * <code>int32 durability = 4;</code>
     */
    public fun clearDurability() {
      _builder.clearDurability()
    }

    /**
     * <code>int32 max_durability = 5;</code>
     */
    public var maxDurability: kotlin.Int
      @JvmName("getMaxDurability")
      get() = _builder.getMaxDurability()
      @JvmName("setMaxDurability")
      set(value) {
        _builder.setMaxDurability(value)
      }
    /**
     * <code>int32 max_durability = 5;</code>
     */
    public fun clearMaxDurability() {
      _builder.clearMaxDurability()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack.copy(block: com.kyhsgeekcode.minecraft_env.proto.ItemStackKt.Dsl.() -> kotlin.Unit): com.kyhsgeekcode.minecraft_env.proto.ObservationSpace.ItemStack =
  com.kyhsgeekcode.minecraft_env.proto.ItemStackKt.Dsl._create(this.toBuilder()).apply { block() }._build()

