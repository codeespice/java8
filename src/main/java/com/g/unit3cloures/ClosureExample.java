package com.g.unit3cloures;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ClosureExample {

    public static void main(String[] args)
    {
        int b =5;
    process(10,getClosure(15));
    }
    public static void process(int a ,Consumer<Integer> consumer)
    {
        consumer.accept(a);
    }
    public static Consumer<Integer> getClosure(int z)
    {

        return (a)->System.out.println(a+z);
    }
}
