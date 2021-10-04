package Lesson7_JVM.Task3;

import Lesson6_Сollections_framework.Find;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class Producer implements Runnable {
    MyQueue myQueue;
    public Producer(MyQueue myQueue){
        this.myQueue = myQueue;
    }
    @Override
    public void run() {
        System.out.println("Start Producer");
        String regex = "\\bстрадани[еяюиймх]*\\b";
        File file = new File("voyna.txt");
        try {
            FileReader fr = new FileReader(file);
            List<String> list = Find.countRegexInTextFile(regex, fr);
            System.out.println("Find " + list.size() + " elements");
            myQueue.add(list);
        } catch (FileNotFoundException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
