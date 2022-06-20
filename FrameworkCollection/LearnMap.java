package com.company.FrameworkCollection;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {
        Map<String,Integer> nums = new HashMap<>();
        nums.put("one",1);
        nums.put("Two",2);
        nums.put("Three",3);
//        System.out.println(nums);


        if(!nums.containsKey("Four")){
            nums.put("Four",4);
        }
        nums.putIfAbsent("Four",4);
//        System.out.println(nums);

        //Iterate
        for(Map.Entry<String,Integer> e: nums.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key : nums.keySet()){
            System.out.println(key);
        }

        for(Integer val : nums.values()){
            System.out.println(val);
        }
    }
}
