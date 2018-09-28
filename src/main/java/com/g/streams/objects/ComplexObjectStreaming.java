package com.g.streams.objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ComplexObjectStreaming{
    public static void main(String[] args)
    {
        List<Book> bookList = new ArrayList<Book>();

        // Adding Books
        bookList.add(new Book("Java Basics",
                new Author("Peter", "peter@yahoo.com", "M",25), 1000.50));

        bookList.add(new Book("Mysql Basics",
                new Author("Steve", "steve@yahoo.com", "F",35), 2000.0));

        bookList.add(new Book("Oracle Basics",
                new Author("John", "john@yahoo.com", "M",45), 3000.0));

        bookList.add(new Book("Angular Basics",
                new Author("Dave", "dave@yahoo.com", "F",55), 3000.0));

        bookList.add(new Book("Jquery Basics",
                new Author("Dave", "dave@yahoo.com","M", 55), 1000.0));

        System.out.println("Sum of all ages of authors who are male and age <50");
        //Sum of ages of all male authors younger than 50
        Integer sumofAgesofAuthors= bookList.stream()
                .map(book->book.getAuthor())
                .filter(author->author.getGender().equals("M"))
                .map(author->author.getAge())
                .filter(age->age<50)
                .reduce(0,(x,sum)->sum+x);
        System.out.println(sumofAgesofAuthors);

        //Sorted
        System.out.println("Sorted authors");
        List<Book> SortedList= bookList.stream().sorted((b1,b2)->b1.getPrice()>b2.getPrice()?1:-1)
                .collect(Collectors.toList());
        SortedList.stream().forEach(System.out::println);

        System.out.println("Groupby");
        Map<Double,List<Book>> groupByPrice= bookList.stream().collect(Collectors.groupingBy(Book::getPrice));
        groupByPrice.entrySet().stream().forEach(System.out::println);
    }
}
