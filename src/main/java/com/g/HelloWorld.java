package com.g;

import jdk.nashorn.internal.objects.annotations.Function;

public class HelloWorld {

public void greet(MyLambda lambda)
{
    lambda.greet();
}
public void performOperation(int a , int b,Operation operation)
    {
        System.out.println(operation.operate(a,b));
    }
    public static void main(String[] args)
    {
        HelloWorld helloWorld = new HelloWorld();

        MyLambda greetingInEnglish =()->System.out.println("Oam Vigneswara");
        helloWorld.greet(greetingInEnglish);
        helloWorld.greet(()->System.out.println("Dhanyawadam"));
        helloWorld.greet(()->System.out.println("Shukria"));

        helloWorld.performOperation(5,6,(int a,int b)->a+b);
        helloWorld.performOperation(5,6,(int a,int b)->a*b);
        helloWorld.performOperation(5,6,(int a,int b)->a/b);

    }
}
@FunctionalInterface
interface MyLambda{
    public void greet();

}
@FunctionalInterface
interface Operation{
    public int operate(int a , int b);

}