package com.g.coding;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ReversingOrderOfWords {
    public static void main(String[] args)
    {
        String mainString = "Method to reverse words in String in Java";
        Optional<String> finalString = reverseWords(mainString);

        finalString.ifPresent(System.out::println);
    }
    public static Optional<String> reverseWords(String sentence){


        if(sentence.trim().isEmpty())
        {
            return Optional.empty();
        }
        List<String> wordsList = Arrays.asList(sentence.split("\\s"));
        Collections.reverse(wordsList);

        String finalList =  wordsList.stream().reduce("",(x,m)->x+" "+m);

        return Optional.of(finalList);
    }
}
