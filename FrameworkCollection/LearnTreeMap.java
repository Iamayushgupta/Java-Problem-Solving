package com.company.FrameworkCollection;

import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> dic = new TreeMap<>();
        dic.put("ayush",10);
        dic.put("parus",11);
        dic.put("abhi",7);
        dic.put("navya",100);
        System.out.println(dic);
        dic.remove("parus");
        System.out.println(dic);
    }
}
