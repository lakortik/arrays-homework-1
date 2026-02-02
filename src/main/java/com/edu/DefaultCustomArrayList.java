package com.edu;

import java.util.Iterator;


public class DefaultCustomArrayList<E> implements CustomArrayList<E> {
    Object[] result = new Object[0];
    MyIterator<Object> iterator = new MyIterator<Object>(result);

    public DefaultCustomArrayList() {
    }

    @Override
    public boolean add(E element) {

        Object[] newResult = new Object[result.length + 1];
        for (int i = 0; i < result.length; i++) {
            if (result[i] != element) {
                newResult[i] = result[i];
            }
        }
        newResult[result.length] = element;
        result = newResult;
        iterator = new MyIterator<Object>(result);

        return true;
    }

    @Override
    public boolean remove(E element) {
        if (result != null && result.length != 0) {
            Object[] newResult = new Object[result.length - 1];
            for (int i = 0; i < result.length-1; i++) {
                if (result[i] != element) {
                    newResult[i] = result[i];
                }
            }
            result = newResult;
        }
        iterator = new MyIterator<Object>(result);

        return  true;
    }

    private void remove(int index) {
        if (result != null && result.length != 0) {
            Object[] newResult = new Object[result.length - 1];
            for (int i = 0; i < result.length; i++) {
                if (i != index) {
                    newResult[i] = result[i];
                }
            }
            result = newResult;
        }
    }

    @Override
    public Object get(int index) {
        return result[index];
    }

    @Override
    public int size() {
        return result.length;
    }

    @Override
    public boolean isEmpty() {
        return result == null || result.length == 0;
    }

    @Override
    public void clear() {
        result = new Object[0];
    }

    @Override
    public boolean contains(E element) {
        boolean res = false;
        for (Object o : result) {
            if (element == o) {
                res = true;
            }
        }
        return res;
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) iterator;
    }
}