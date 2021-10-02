package Lesson7_JVM.Task3;

import java.util.concurrent.LinkedBlockingQueue;

public class MyQueue {

    LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

    public synchronized void add(String s){
        linkedBlockingQueue.add(s);
    }
    public synchronized void reduce(){
        linkedBlockingQueue.remove();
    }
}
