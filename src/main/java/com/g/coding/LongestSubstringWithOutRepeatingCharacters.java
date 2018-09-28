package com.g.coding;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LongestSubstringWithOutRepeatingCharacters {

    public int lengthofLongestSubstring(String s)
    {

        LinkedHashSet<Character> visited= new LinkedHashSet<Character>();
        int maxlength=0;
        int i=0;
       while(i<s.length())
        {
            int j=i;
            while(j<s.length())
            {
                if(!visited.contains(s.charAt(j)))
                {
                    visited.add(s.charAt(j));
                    j++;
                }
                else
                {
                    int temp =visited.size();

                    if(temp>maxlength)
                    {
                        for(Character c: visited)
                        {
                            System.out.print(c);
                        }
                        System.out.println("");
                        maxlength=temp;
                    }
                    visited.clear();
                    i=i+1;
                    j+=s.length();


                }
            }
        }
        return maxlength;
    }
    public static void main(String[] args)
    {
        LongestSubstringWithOutRepeatingCharacters s = new LongestSubstringWithOutRepeatingCharacters();
        System.out.println(s.lengthofLongestSubstring("pwwkew"));
    }
}
