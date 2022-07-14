package com.codedifferently.problem01;

import java.util.Arrays;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){
        Arrays.sort(allNumbers);
        String longest = "";
        String temp = "" + allNumbers[0];
        for(int i = 1; i < allNumbers.length; i++){
            boolean consecutive = (Math.abs(allNumbers[i] - allNumbers[i - 1])) == 1;
            if(consecutive)
                temp += " " + allNumbers[i];
            else
                temp = "" + allNumbers[i];
            if(temp.length() > longest.length())
                longest = temp;
        }
        if(temp.length() > longest.length())
            longest = temp;

        return String.format("Longest Set: {%s}",longest);
    }
}
