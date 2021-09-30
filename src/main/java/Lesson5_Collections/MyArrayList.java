package Lesson5_Collections;

import java.util.*;

public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_SIZE = 10;
    private int countElement;
    private int size;
    Object[] array;

    public MyArrayList() {
        array = new Object[DEFAULT_SIZE];
    }

    @Override
    public int size() {
        return countElement;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public boolean add(E o) {
        grow(countElement);
        countElement++;
        array[countElement] = o;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        try {
            E[] newCollection = (E[]) c.toArray();
            for (E e : newCollection) {
                add(e);
            }
        } catch (ClassCastException e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        array = new Object[DEFAULT_SIZE];
    }

    @Override
    public E get(int index) {
        return (E) array[index];
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
        Object a = array[index];
        array[index] = null;
        cleanNull();
        return (E) a;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (arr[i] == array[j]) {
                    remove(j);
                }
            }
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return array;
    }

    private void grow(int oldSize) {
        if (oldSize >= array.length) {
            size = oldSize + oldSize / 2;
            array = Arrays.copyOf(array, size);
        }
    }

    private void cleanNull() {
        Object[] newArr = new Object[countElement];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newArr[count] = array[i];
                count++;
            }
        }
        array = newArr;
    }

    public String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
