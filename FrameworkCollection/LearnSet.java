package com.company.FrameworkCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(41);
        set.add(5);
        set.add(17);
        System.out.println(set);
        set.remove(32);
        System.out.println(set.contains(41));
        System.out.println(set.size());
        System.out.println(set);

        Set<Integer> newSet = new LinkedHashSet<>();
        newSet.add(32);
        newSet.add(41);
        newSet.add(5);
        newSet.add(17);
        System.out.println(set);
        set.remove(32);
//        System.out.println(set.contains(41));
//        System.out.println(set.size());
        System.out.println(newSet);

        Set<Integer> tree = new TreeSet<>();
        tree.add(31);
        tree.add(11);
        tree.add(5);
        tree.add(25);
        System.out.println(tree);

    }
}
