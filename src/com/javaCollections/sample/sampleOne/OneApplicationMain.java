package com.javaCollections.sample.sampleOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneApplicationMain {
    public static void main(String[] args) {

        Student studentOne = new Student();
        studentOne.setId(1);
        studentOne.setFirstName("Armin");

        Student studentTwo = new Student();
        studentTwo.setId(1);
        studentTwo.setFirstName("Armin");

        System.out.println(studentOne);
        System.out.println(studentTwo);
        System.out.println(studentOne.equals(studentTwo));

        Set<Student> mySet = new HashSet<>();
        mySet.add(studentOne);
        mySet.add(studentTwo);
        System.out.println("My set size : " + mySet.size());

        List<Student> myList = new ArrayList<>();
        myList.add(studentOne);
        myList.add(studentTwo);
        System.out.println("My list size : " + myList.size());

    }
}
