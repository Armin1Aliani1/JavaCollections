package com.javaCollections.iterable.testTwoIterable;

public class IterableTwoMain {
    public static void main(String[] args) {
        IterableTwoAlphabet iterableTwoAlphabet = new IterableTwoAlphabet();
        for (Character character : iterableTwoAlphabet) {
            System.out.println(character);
        }
        /*Iterator iterator = new iterableTwoAlphabet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
