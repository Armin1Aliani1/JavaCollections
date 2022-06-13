package com.javaCollections.practice.practiceOne;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMainPOne {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrayListOne = new ArrayList<String>();
        arrayListOne.add("Armin");
        arrayListOne.add("Ali");

        for (String string : arrayListOne) {
            System.out.println(string);
        }

        System.out.println("Please enter your name : ");
        String strOne = scanner.nextLine();

        /*arrayListOne.add(1,strOne);
        System.out.println();
        for (String string:arrayListOne){
            System.out.println(string);
        }*/

        /*arrayListOne.set(1,strOne);
        System.out.println();
        for (String string:arrayListOne){
            System.out.println(string);
        }*/

        arrayListOne.remove(1);
        arrayListOne.add(strOne);
        System.out.println();
        for (String string : arrayListOne) {
            System.out.println(string);
        }

    }
}
