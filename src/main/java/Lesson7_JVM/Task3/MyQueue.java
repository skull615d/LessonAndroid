package Lesson7_JVM.Task3;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

public class MyQueue {

    static int capacity = 7;

    static int sizeList = -1;

    static LinkedBlockingQueue<String> linkedBlockingQueue = new LinkedBlockingQueue<>(capacity);

    public synchronized void add(List<String> list) throws InterruptedException {
        sizeList = list.size();
            for (int i = 0; i < list.size() && !Thread.currentThread().isInterrupted(); i++) {
                if (i >= capacity) {
                    this.wait();
                    System.out.println("add wait");
                }
                linkedBlockingQueue.add(list.get(i));
                System.out.println("add in queue: " + list.get(i));
                this.notify();
                if (i >= list.size()) {
                    Thread.currentThread().interrupt();
                }
            }
    }

    public synchronized void take() throws InterruptedException {
        int count = 0;
        while (!Thread.currentThread().isInterrupted()) {
            while (linkedBlockingQueue.size() == 0) {
                System.out.println("take wait");
                this.wait();
            }
            linkedBlockingQueue.take();
            count++;
            System.out.println("get out queue element: " + count);
            this.notify();
            if (count >= sizeList) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
