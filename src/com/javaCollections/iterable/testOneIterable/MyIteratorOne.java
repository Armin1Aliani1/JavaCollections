package com.javaCollections.iterable.testOneIterable;

import java.util.Iterator;

public class MyIteratorOne implements Iterator<Character> {
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
