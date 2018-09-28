package com.g.exceptions;

import java.util.function.BiConsumer;

public class ExceptionHandler {
    public static void main(String[] args)
    {
      int [] myList = {1,5,8,9};
      int key=0;
        process(myList,key,(v,k)->{
            try {
                System.out.println(v / k);
            }
            catch(Exception e)
            {
                System.out.println("Exception occured "+e);
            }

        });

    }

    public static void process(int [] myList,int key,BiConsumer<Integer,Integer> consumer)
    {

            for (int v : myList) {
                consumer.accept(v, key);
            }

    }
}
