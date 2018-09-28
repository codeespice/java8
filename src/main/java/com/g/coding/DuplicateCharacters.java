package com.g.coding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Map<Character,Integer> duplicatesMap= getDuplicates("Programming");
      List<Character> duplicates=  duplicatesMap.entrySet().stream()
              .filter(p->p.getValue()>1).map(p->p.getKey()).collect(Collectors.toList());

        duplicates.forEach(System.out::println);
    }

    public static Map<Character,Integer> getDuplicates(String mainString)
    {
        Map<Character,Integer> duplicates =new HashMap<Character, Integer>();
        char[] mainChars = mainString.replaceAll("\\s","").toUpperCase().toCharArray();
        for(char c : mainChars)
        {
            if(duplicates.containsKey(c))
            {
                int count = duplicates.get(c);
                duplicates.put(c,count+1);

            }
            else
            {
                duplicates.put(c,1);
            }
        }

        return duplicates;
    }
}
