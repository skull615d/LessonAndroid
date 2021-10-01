package Lesson6_Сollections_framework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lesson6 {
    public static void main() {
        String regex = "\\bстрадани[еяюиймх]*\\b";//\s - пробельный символ
        Parser parser = new Parser();
        ArrayList<String> list = new ArrayList<>();
        File file = new File("voyna.txt");
        try {
            list = parser.parseBufferedReader(file);
            StringBuilder sb = new StringBuilder();
            list.forEach(sb::append);
            Find.countRegexInText(regex, sb);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader fr = new FileReader(file);
            Find.countRegexInTextFile(regex, fr);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        PrintTable.multiplicationTable();
    }
}
