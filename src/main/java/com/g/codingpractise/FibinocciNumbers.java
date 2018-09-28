package com.g.codingpractise;

public class FibinocciNumbers {

    public static void main(String[] args)
    {


        System.out.println(fibinocci(12));
    }
    public static int fibinocci(int number)
    {
       if(number ==1 || number ==2)
       {
           return 1;
       }
       return fibinocci(number-1)+fibinocci(number-2);
    }
}
