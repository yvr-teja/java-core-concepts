package org.Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
       StringBuilder result = new StringBuilder();

       //array sorting
        Arrays.sort(strs);

        //get first and last strings
        char[] first = strs[0].toCharArray();
        char [] last = strs[strs.length - 1].toCharArray();

        //Start comparing characters of first and last strings
        for (int i = 0; i < Math.min(first.length, last.length); i++) {
            if (first[i] == last[i])
                result.append(first[i]);
            else
                break; // Stop when characters differ
        }
       return result.toString();
    }
    public static void main(String[] args) {
        LongestCommonPrefix14 lcp = new LongestCommonPrefix14();
        String[] strs = {"feel","flower", "flow", "flight"};
        String prefix = lcp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + prefix); // Output: "fl"
    }
}
