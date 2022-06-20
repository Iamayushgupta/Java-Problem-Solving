package com.company.FrameworkCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>();
        name.add(10);
        name.add(20);
        name.add(15);
        //initial ArrayList size if 10
        //On adding the 11th element its size changes to
        //== (n + n/2 + 1)
        name.add(1,100);
//        System.out.println(name);
        ArrayList<Integer> temp =new ArrayList<>();
        temp.add(200);
        temp.add(300);
        name.addAll(temp);
//        System.out.println(name);

//        System.out.println(name);
        name.remove(2);
//        System.out.println(name);
        name.remove(Integer.valueOf(10));
//        System.out.println(name);
//        name.clear();
        name.set(0,-100);
//        System.out.println(name);

        //Traversing methods
        for(int i=0;i<name.size();i++){
            System.out.println(name.get(i));
        }

        for (Integer ele : name){
            System.out.println(ele);
        }

        Iterator<Integer> it = name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


}
