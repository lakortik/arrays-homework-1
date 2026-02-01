package com.edu;

import java.util.ArrayList;
import java.util.Iterator;


public class DefaultCustomArrayList<E> implements CustomArrayList<E> {
    ArrayList<E> result = new ArrayList<E>();
    MyIterator<E> iterator = new MyIterator<E>(result);

    public DefaultCustomArrayList() {
    }

    @Override
    public boolean add(E element) {
 int q = 1234;
 q= q+2;
        return result.add(element);
    }

    @Override
    public boolean remove(E element) {
        return result.remove(element);
    }

    private void remove(int index) {
    }

    @Override
    public E get(int index) {
        return result.get(index);
    }

    @Override
    public int size() {
        return result.size();
    }

    @Override
    public boolean isEmpty() {
        return result.size()==0;
    }

    @Override
    public void clear() {
        result = new ArrayList<>();
    }

    @Override
    public boolean contains(E element) {
        return result.contains(element);
    }

    @Override
    public Iterator<E> iterator() {
        return iterator;
    }
}