package com.codedifferently.problem02;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<Character, Integer> letterMap = new TreeMap<>();
        for(int i = 0; i < input.length(); i++){
            char key = input.charAt(i);
            if(letterMap.containsKey(key)) {
                int value = letterMap.get(key) + 1;
                letterMap.put(key, value);
            }
            else {
                letterMap.put(key, 1);
            }
        }
        String out = "";
        for(Map.Entry<Character, Integer> entry: letterMap.entrySet())
            out += entry.getKey() + ":" + entry.getValue() + " ";

        return out.trim();
    }
}
