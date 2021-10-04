package Lesson7_JVM;


public class MyThreads {

    private static final int COUNT_MAX = 20;//Integer.MAX_VALUE;

    private static Integer count = 0;

    private static final Object LOCK = new Object();

    static void setValue() {
        synchronized (LOCK) {
            count++;
            LOCK.notifyAll();
        }
    }

    static void getValue(int i) {
        synchronized (LOCK) {
            while (true) {
                if (count != 0 && count % i == 0) {
                    System.out.println("message " + i + " sec");
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void main(String[] arg) {

        Thread threadTimer5 = new Thread(() -> getValue(5));
        Thread thread2Timer7 = new Thread(() -> getValue(7));

        Thread thread1 = new Thread(() -> {
            while (count < COUNT_MAX) {
                setValue();
                System.out.println(count);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        threadTimer5.start();
        thread1.start();
        thread2Timer7.start();
    }
}
