package org.Leetcode.blind75.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        //array[] ={2,7,11,15}
        //target=9
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            int diff=target-nums[i]; //13-
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
