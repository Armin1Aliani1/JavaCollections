package com.javaCollections.collection.testThreeCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionThreeMain {
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);
        mySet.add(10);
        mySet.add(30);
        mySet.add(null);
        mySet.remove(30);
        for (Integer element : mySet) {
            System.out.println(element);
        }
        System.out.println("My set size : " + mySet.size());
        System.out.println();

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(null);
        myList.remove(0);
        for (Integer element : myList) {
            System.out.println(element);
        }

        System.out.println("My list size : " + myList.size());

    }
}
