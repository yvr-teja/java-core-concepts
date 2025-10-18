package org.Leetcode.blind75.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        boolean result=false;
        Set<Integer> containerHashSet =new HashSet<>();
        for (int i=0;i<nums.length;i++){

            if (containerHashSet.contains(nums[i])){
                result=true;
                return result;
            }
            else {
                containerHashSet.add(nums[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        boolean b = containsDuplicate(new int[]{1, 2, 3, 4, 4});
        System.out.println(b);
    }
}
