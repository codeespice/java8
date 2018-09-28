package com.g.coding;

import java.util.Arrays;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args)
    {
        String firstString = "Mother In Law";
        String secondString= "Hitler woman";
       boolean status= isAnagramSecond(firstString,secondString);
       System.out.println("status:"+status);
    }

    public static boolean isAnagram(String mainString,String compareString)
    {
       String cleansedMainString =  mainString.replaceAll("\\s","");
       String cleansedCompareString = compareString.replaceAll("\\s","").toLowerCase();

       if(cleansedMainString.length() != cleansedCompareString.length())
       {
           return false;
       }

       char[] mainChar=  cleansedMainString.toLowerCase().toCharArray();
       char[] compareChar = cleansedCompareString.toLowerCase().toCharArray();


        Arrays.sort(mainChar);
        Arrays.sort(compareChar );
        System.out.println(mainChar+ " ,"+compareChar);
        return Arrays.equals(mainChar,compareChar);
    }
    public static boolean isAnagramSecond(String mainString,String compareString)
    {
        String cleansedMainString =  mainString.replaceAll("\\s","");
        String cleansedCompareString = compareString.replaceAll("\\s","").toLowerCase();

        if(cleansedMainString.length() != cleansedCompareString.length())
        {
            return false;
        }

        char[] mainChar=  cleansedMainString.toLowerCase().toCharArray();
        char[] compareChar = cleansedCompareString.toLowerCase().toCharArray();

        for(char c : mainChar)
        {
            int count =0;
            for(char d : compareChar)
            {

                if( c==d)
                {
                    compareChar[count]='!';
                }
                count++;
            }
        }
        System.out.println("main Char");
        System.out.println();
       for(char c:mainChar)
       {
           System.out.print(c);
       }
        System.out.println();
        System.out.println("compare Char");
        System.out.println();
        for(char c:compareChar)
        {
            System.out.print(c);
        }
        System.out.println();
        for(char c:compareChar)
        {
            if(c !='!')
            {
               return false;
            }
        }


        return true;
    }
}
