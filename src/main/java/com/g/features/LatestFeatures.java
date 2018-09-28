package com.g.features;

import com.g.unit1.Person;

import java.util.Arrays;
import java.util.List;

public class LatestFeatures
{
    public static void main(String args[])
    {
        List<Person> persons= Arrays.asList(
                new Person("charles","Dickens",29),
                new Person("Eienstein","Sir",80),
                new Person("John ","Greesham",40),
                new Person("Morgan","Freeman",60)



        );
        persons.forEach((p)->{
           p.setLastName("demo");

        });
        persons.forEach((p)->{
           System.out.println(p);

        });
    }
}
