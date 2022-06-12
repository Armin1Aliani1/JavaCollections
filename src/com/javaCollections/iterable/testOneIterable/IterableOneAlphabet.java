package com.javaCollections.iterable.testOneIterable;

import java.util.Iterator;

public class IterableOneAlphabet implements Iterable<Character> {
    @Override
    public Iterator iterator() {
        MyIteratorOne myIteratorOne = new MyIteratorOne();
        return myIteratorOne;
    }
    // (Iterator) Gives us the ability to rotate in a container
}
