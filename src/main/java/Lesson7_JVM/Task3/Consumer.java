package Lesson7_JVM.Task3;

public class Consumer implements Runnable{
    MyQueue myQueue;

    public Consumer(MyQueue myQueue){
        this.myQueue = myQueue;
    }
    @Override
    public void run() {
        System.out.println("Start Consumer");
        try {
            myQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
