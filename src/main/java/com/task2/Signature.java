package com.task2;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    public Consumer<T> consumer;

    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        consumer.accept(arg);
    }
}
