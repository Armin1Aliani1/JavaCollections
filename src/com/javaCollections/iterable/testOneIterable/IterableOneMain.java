package com.javaCollections.iterable.testOneIterable;

public class IterableOneMain {
    public static void main(String[] args) {
        IterableOneAlphabet iterableOneAlphabet = new IterableOneAlphabet();
        for (Character character : iterableOneAlphabet) {
            System.out.println(character);
        }
        /*Iterator iterator = new IterableOneAlphabet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
