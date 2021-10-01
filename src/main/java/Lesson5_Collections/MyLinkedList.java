package Lesson5_Collections;

import java.util.*;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyLinkedList() {

    }

    public void addFirst(E value) {
        if (first == null) {
            first = new Node<>(null,
                    value,
                    null);
            last = first;
        } else {
            Node<E> newFirst = new Node<E>(null, value, first);
            first.prev = newFirst;
            first = newFirst;
        }
        size++;
    }

    public void addLast(E value) {
        if (last == null) {
            last = new Node<>(null,
                    value,
                    null);
        } else {
            Node<E> newLast = new Node<E>(last, value, null);
            last.next = newLast;
            last = newLast;
        }
        size++;
    }

    public void removeLast() {
        if (last != null) {
            last = last.prev;
            size--;
        }
    }

    public void removeFirst() {
        if (first != null) {
            first = first.next;
            size--;
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        var s = "Lesson5_Collections.MyLinkedList{" +
                "first=" + first.item +
                ", last=" + last.item +
                ", size=" + size +
                '}';
        return s;
    }
}
