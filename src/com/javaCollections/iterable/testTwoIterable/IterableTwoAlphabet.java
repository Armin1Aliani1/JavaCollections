package com.javaCollections.iterable.testTwoIterable;

import java.util.Iterator;

public class IterableTwoAlphabet implements Iterable<Character> {
    char letter = 'a';

    // Cannot build object from abc classes
    // A new object cannot be created from abstract classes
    /*public void testMyIteratorTwo() {
        MyIteratorTwo myIteratorTwo = new MyIteratorTwo() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Character next() {
                return null;
            }
        };
    }*/
    // A new object cannot be created from abstract classes
    // Cannot build object from abc classes

    @Override
    public Iterator iterator() {
        // Anonymous class OR Class without name
        // An unnamed class that extend(inherits) from the Iterator class
        return new Iterator() {
            //        Iterator iterator = new Iterator() {
            // Anonymous class OR Class without name
            @Override
            public boolean hasNext() {
                return letter <= 'z';
            }

            @Override
            public Character next() {
                return letter++;
            }
        };
//        return iterator;
        // Anonymous class OR Class without name
    }
    // (Iterator) Gives us the ability to rotate in a container
}
