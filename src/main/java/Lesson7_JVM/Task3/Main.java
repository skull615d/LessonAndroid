package Lesson7_JVM.Task3;

import Lesson6_Сollections_framework.Lesson6;

import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] arg) {
        MyQueue myQueue = new MyQueue();
        Thread thread = new Thread(new Consumer(myQueue));
        Thread thread1 = new Thread(new Producer(myQueue));
        thread.start();
        thread1.start();
    }
}
