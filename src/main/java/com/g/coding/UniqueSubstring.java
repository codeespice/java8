package com.g.coding;

import java.util.HashSet;

public class UniqueSubstring {
    public static void main(String args[])
    {
        String mainString = "abcbbbbcccbdddadacb";
       String uniqueString= uniqueSubstring(mainString ,3);
       System.out.println(uniqueString);
    }

    public static String uniqueSubstring(String mainString,int length)
    {

        char[] temp = mainString.toCharArray();
        HashSet<Character> uniqueElements = new HashSet<Character>();
        char current=temp [0];
        char previous =temp [0];
        char[] end = new char[temp.length];
        int reset=0;
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            current = temp[i];
            if(current!=previous)
            {
                if(!uniqueElements.contains(current)) {
                    reset++;
                    uniqueElements.add(current);
                }
                if(reset>=length)
                {
                    System.out.println("broke at:"+i+ " and "+current);
                    break;

                }
                else
                {
                    end[i]=current;
                    count++;
                }


            }
            else
            {
                end[i]=current;
                count++;
            }
            previous=current;
        }
        String subs= String.valueOf(end,0,count);
        return subs;
    }
}
