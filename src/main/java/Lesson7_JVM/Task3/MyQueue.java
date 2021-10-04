package Lesson7_JVM.Task3;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class MyQueue {

    static int capacity = 7;

    static int sizeList = -1;

    static LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(capacity);

    private static final Object LOCK = new Object();

    public static void add(List<String> list) throws InterruptedException {
        sizeList = list.size();
        synchronized (LOCK) {
            //while (i < list.size()) {
            for (int i = 0; i < list.size() && !Thread.currentThread().isInterrupted(); i++) {
                if (i >= capacity) {
                    LOCK.wait();
                    System.out.println("add wait");
                }
                linkedBlockingQueue.add(list.get(i));
                System.out.println("add in queue: " + list.get(i));
                LOCK.notify();
                if (i >= list.size()) {
                    Thread.currentThread().interrupt();
                }
            }
//            while (!Thread.currentThread().isInterrupted()) {
//                for (String item : list) {
//                    if(linkedBlockingQueue.size()<capacity){
//                        linkedBlockingQueue.add(item);
//                        System.out.println("add: " + item);
//                        LOCK.notify();
//                    }else{
//                        try {
//                            LOCK.wait();
//                            System.out.println("wait");
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
        }
    }

    public static void take() throws InterruptedException {
        int count = 0;
        synchronized (LOCK) {
            while (!Thread.currentThread().isInterrupted()) {
                while (linkedBlockingQueue.size() == 0) {
                    System.out.println("take wait");
                    LOCK.wait();
                }
                linkedBlockingQueue.take();
                count++;
                System.out.println("get out queue element: " + count);
                LOCK.notify();
                if (count >= sizeList) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
