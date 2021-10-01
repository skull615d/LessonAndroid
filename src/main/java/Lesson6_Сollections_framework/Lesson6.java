package Lesson6_Сollections_framework;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Lesson6 {
    public static void main() {
        Parser parser = new Parser();
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            arrayList = parser.parse(new File("voyna.txt"));
        }catch (IOException e){
            e.printStackTrace();
        }
        arrayList.forEach(System.out::println);
    }
}
