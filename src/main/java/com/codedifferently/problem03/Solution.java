package com.codedifferently.problem03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public Integer[] stringToNumbers(String[] input){
        Map<String, Integer> map = new HashMap<>();
        List<Integer> out = new ArrayList<>();
        for(String number: input){
            if(number.equals("one"))
                out.add(1);
            else if(number.equals("two"))
                out.add(2);
            else if(number.equals("three"))
                out.add(3);
            else if(number.equals("four"))
                out.add(4);
            else if(number.equals("five"))
                out.add(5);
            else if(number.equals("six"))
                out.add(6);
            else if(number.equals("seven"))
                out.add(7);
            else if(number.equals("eight"))
                out.add(8);
            else if(number.equals("nine"))
                out.add(9);
            else if(number.equals("ten"))
                out.add(10);
            else if(number.equals("eleven"))
                out.add(11);
            else if(number.equals("twelve"))
                out.add(12);
            else if(number.equals("thirteen"))
                out.add(13);
            else if(number.equals("fourteen"))
                out.add(14);
            else if(number.equals("fifteen"))
                out.add(15);
            else if(number.equals("sixteen"))
                out.add(16);
            else if(number.equals("seventeen"))
                out.add(17);
            else if(number.equals("eighteen"))
                out.add(18);
            else if(number.equals("nineteen"))
                out.add(19);
            else if(number.equals("twenty"))
                out.add(20);
        }
        return out.toArray(Integer[]::new);
    }
}
