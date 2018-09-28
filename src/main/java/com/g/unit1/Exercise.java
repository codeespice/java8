package com.g.unit1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Exercise {
    public static void main(String args[])
    {
        List<Person> persons= Arrays.asList(
                new Person("charles","Dickens",29),
                new Person("Eienstein","Sir",80),
                new Person("John ","Greesham",40),
                new Person("Morgan","Freeman",60)



        );
        System.out.println("original");
        printAll(persons);
        //sort list by lastName
        Collections.sort(persons, (p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
        System.out.println("After Sort");
        printAll(persons);
        //Create the method that prints all the list of the element
        System.out.println("just printing");
        printAll(persons);
        //Create the method that prints all the list of the element starts with D
        System.out.println("printing all the lastname with D");
        //printAll(persons,"D");
        printConditionally(persons,(p)->
        {
           if(p.getLastName().startsWith("D")){
               return true;
           }
           else
           {
               return false;
           }
        });
        printConditionally(persons,(p)->
        {
            if(p.getLastName().startsWith("F")){
                return true;
            }
            else
            {
                return false;
            }
        });
    }
    public static void printAll(List<Person> persons,String s)
    {
        for(Person p : persons)
        {
            if(p.getLastName().startsWith(s)) {
                System.out.println(p);
            }
        }
    }
    public static void printAll(List<Person> persons)
    {
        for(Person p : persons)
        {
            System.out.println(p);
        }
    }
    public static void printConditionally(List<Person> persons,FilterCondition fc)
    {
        for(Person p : persons)
        {
            if(fc.test(p)) {
                System.out.println(p);
            }
        }
    }
}

interface FilterCondition{
    boolean test(Person p);
}