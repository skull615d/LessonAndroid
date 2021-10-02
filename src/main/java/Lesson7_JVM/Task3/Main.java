package Lesson7_JVM.Task3;

import Lesson6_Сollections_framework.Lesson6;

public class Main {
    public static void main(String[] arg) {
        Thread thread = new Thread(new Consumer());
        Thread thread1 = new Thread(new Producer());
        thread.start();
        thread1.start();
    }
}
