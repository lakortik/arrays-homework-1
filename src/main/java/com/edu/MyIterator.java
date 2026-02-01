package com.edu;


import java.util.ArrayList;
import java.util.Iterator;

public class MyIterator<E> implements Iterator<E> {

    ArrayList<E> listFromParent = new ArrayList<E>();
    Integer currentIndex = 0;
    public MyIterator(){

    }

    public MyIterator(ArrayList<E> result) {

        listFromParent = result;
    }

    @Override
    public boolean hasNext() {
        return listFromParent.size()>=currentIndex+1;
    }

    @Override
    public E next() {
        return listFromParent.get(currentIndex++);
    }
}
