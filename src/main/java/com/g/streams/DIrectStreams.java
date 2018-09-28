package com.g.streams;

import java.util.stream.Stream;

public class DIrectStreams {
    public static void main(String args[])
    {

        //Iterate Method of Stream
        Stream.iterate(1,element->element+1)
                .filter(element->element%10==0)
                .limit(5)
                .forEach(System.out::println);
    }
}
