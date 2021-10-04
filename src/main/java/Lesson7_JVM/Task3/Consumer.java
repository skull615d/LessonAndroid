package Lesson7_JVM.Task3;

public class Consumer implements Runnable{
    @Override
    public void run() {
        System.out.println("Start Consumer");
        try {
            MyQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
