package com.g;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Demo {
    public static void main(String args[])
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("client_id", "demo");
        map.put("client_secret", "demo");
        map.put("grant_type", "demo");

        Set<Map.Entry<String, String>> demos =  map.entrySet();
        System.out.println(map);

    }
}
