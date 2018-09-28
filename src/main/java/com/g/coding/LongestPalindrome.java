package com.g.coding;

public class LongestPalindrome {
public static void main(String[] args)
{

    String mainString = "dabcba";
   String longestPalindorme = longestPalindrome(mainString);
   System.out.println("Longest palindrome::::"+longestPalindorme);
}
public static String longestPalindrome(String mainString)
{
    if (mainString.isEmpty()) {
        return null;
    }

    if (mainString.length() == 1) {
        return mainString;
    }
    String longest =mainString.substring(0,1);
    for(int i=0;i<mainString.length();i++)
    {
        String tmp =helper(mainString,i,i);
        if(tmp.length()>longest.length() )
        {
            longest=tmp;
        }
        tmp =helper(mainString,i,i+1);
        if(tmp.length()>longest.length() )
        {
            longest=tmp;
        }

    }

    return longest;
}
    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }
}
