package org.envirocar.trackcount.kafka;

import org.apache.kafka.common.serialization.Deserializer;

import java.util.Map;

public interface KafkaDeserializer<T> extends Deserializer<T> {
    @Override
    default void configure(Map<String, ?> map, boolean b) {}

    @Override
    default void close() {}
}
