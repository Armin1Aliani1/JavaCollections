package com.javaCollections.iterable.testTwoIterable;

import java.util.Iterator;

public abstract class MyIteratorTwo implements Iterator<Character> {
    char letter = 'a';

    @Override
    public boolean hasNext() {
        // System.out.println("INSIDE hasNext()");
        return letter <= 'z';
    }

    @Override
    public Character next() {
        return letter++;
//        return letter+=2;
    }
}
