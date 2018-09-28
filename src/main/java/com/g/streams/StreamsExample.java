package com.g.streams;

import com.g.streams.objects.Employee;
import com.g.streams.objects.SoftwareEngineer;
import com.g.unit1.Person;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args)
    {
        List<Person> persons= Arrays.asList(
                new Person("charles","Dickens",29),
                new Person("Eienstein","Sir",80),
                new Person("John ","Greesham",40),
                new Person("Morgan","Freeman",60),
                new Person("charles","webb",43),
                new Person("John","Travolta",63),
                new Person("John ","higgman",35),
                new Person("Demi","Levato",42)



        );
        persons.stream()
                .filter(p->p.getLastName().startsWith("D"))

                .forEach(System.out::println);

      //Using filter and count          ;
      long count = persons.stream()
              .filter(p->p.getLastName().startsWith("D"))
              .count();

        System.out.println("printing the collectors");
      //Using Map functionality and collector functionality
      List<String> names= persons.stream().map(p->p.getLastName()).filter(name->name.startsWith("D")).collect(Collectors.toList());

        names.forEach(System.out::println);

        //find any
       Optional<Person> p1 = persons.stream()
               .filter(person->"Eienstein".equals(person.getFirstName())&& person.getAge()>80)
               .findAny();
    System.out.println("p1 value is :"+p1.orElse(null));


       //filter the collection
        System.out.println("Old People list");
    List<Person> oldPerson = persons.stream()
            .filter(person->person.getAge()>=60)
            .collect(Collectors.toList());
        long oldcount = persons.stream()
                .filter(person->person.getAge()>=60)
                .count();

        oldPerson.forEach(System.out::println);
        System.out.println("Old People count is "+count);


        //reduce
        int TotalAge = persons.stream()
                .map(p->p.getAge())
                .reduce(0,(sum,price)->sum+price);

        System.out.println("Total age is  "+TotalAge);


        //Long summary statistics
        LongSummaryStatistics statistics = persons.stream()
                .collect(Collectors.summarizingLong(p->p.getAge()));

        System.out.println("Count  "+statistics.getCount());
        System.out.println("Sum  "+statistics.getSum());
        System.out.println("Max  "+statistics.getMax());
        System.out.println("Average  "+statistics.getAverage());

        //Max
       Person oldestPerson = persons.stream()
               .max((person1,person2)->person1.getAge()>person2.getAge() ? 1 : -1).get();

        System.out.println("Max age:"+oldestPerson);

        //convert list to map
       Map<String,Integer> myMap= persons.stream()
                .collect(Collectors.toMap(p->p.getLastName(),p->p.getAge()));

        Set<Map.Entry<String, Integer>> iterationset= myMap.entrySet();
        System.out.println("convert list to map");

        iterationset.forEach(i->System.out.println(i.getKey()+":"+i.getValue()));

        //Unique elements
        System.out.println("printing unique elements");
         List<String> removedDuplicates = persons.stream()
                .map(p->p.getFirstName())
                .map(s->s.toUpperCase())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(removedDuplicates);

    //flatmap example
        Integer[][] integerArray = {{1,2},{3,4},{5,6}};
        Arrays.stream(integerArray).flatMap(row->Arrays.stream(row)).forEach(System.out::println);


        System.out.println("Software list to employee list");
        //advanced map
        List<SoftwareEngineer> softwareEngineerList = Arrays.asList(
                new SoftwareEngineer("Ram", 30),
                new SoftwareEngineer("Peter", 27),
                new SoftwareEngineer("Dave", 33));
        List<Employee> employeeList = convertToEmployee(softwareEngineerList);
        System.out.println(employeeList);
    }

    public static List<Employee> convertToEmployee(List<SoftwareEngineer> softwareEngineerList )
    {

        List<Employee> employeelist = softwareEngineerList.stream()
                .map((softwareEngineer)->{
                    return new Employee(softwareEngineer.getName(),softwareEngineer.getAge());
                })
                .collect(Collectors.toList());
        return employeelist;

    }
}
