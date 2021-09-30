package Lesson5_Collections;

import Lesson5_Collections.MyArrayList;

import java.util.*;

public class Main {
    public static void main(String[] arg) {
        int findNum1 = 10;

        int findNum2 = 12;

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 100; i > 0; i--) {
            arrayList.add(i);
        }
        int positionInLinkedList = (int)findItemInList(linkedList, 10);
        int positionInArrayList = (int)findItemInList(arrayList, 12);
        System.out.println("Positon in linkedList: " + positionInLinkedList);
        System.out.println("Positon in arrayList: " + positionInArrayList);
        linkedList.remove(positionInLinkedList);
        arrayList.remove(positionInArrayList);

        System.out.println(findItemInList(linkedList, 10));
        System.out.println(findItemInList(arrayList, 12));

        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        System.out.println("MyArraylist: " + myList);

        myList.remove(2);
        System.out.println("MyArraylist remove index 2: " + myList);
        myList.clear();
        System.out.println("MyArraylist clear: " + myList);

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("A");
        myLinkedList.addLast("B");
        myLinkedList.addLast("C");
        myLinkedList.removeFirst();
        System.out.println(myLinkedList);

    }

    public static Object findItemInList(List list, Object element) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
