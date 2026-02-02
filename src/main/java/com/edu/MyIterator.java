package com.edu;


import java.util.Iterator;

public class MyIterator<Object> implements Iterator<Object> {

    Object[] listFromParent;
    Integer currentIndex = 0;
    public MyIterator(){

    }

    public MyIterator(Object[] result) {

        listFromParent = result;
    }

    @Override
    public boolean hasNext() {
        return listFromParent.length>=currentIndex+1;
    }

    @Override
    public Object next() {
        return listFromParent[currentIndex++];
    }
}
