package Lesson6_Сollections_framework;

import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

public class Find {
    public static void countRegexInText(String regex, StringBuilder s) {
        int printSymbols = 10;
        int count = 0;
        Pattern pattern = regexToPattern(regex);
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            count++;
            int startWord = matcher.start();
            int endWord = matcher.end();
            System.out.println(s.substring(startWord - printSymbols, endWord + printSymbols));
            System.out.println("Находится в тектсе c " + startWord + " символа по " + endWord + " символ");
        }
        System.out.println(count);
    }

    public static void countRegexInTextFile(String regex, FileReader fileReader) {
        int count = 0;
        Pattern pattern = regexToPattern(regex);
        Scanner scanner = new Scanner(fileReader);
        List<String> list = scanner.findAll(pattern).
                map(MatchResult::group).
                collect(Collectors.toList());
        count = list.size();
        System.out.println(list.size());
        list.forEach(System.out::println);
    }

    private static Pattern regexToPattern(String regex) {
        try {
            Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            return pattern;
        } catch (PatternSyntaxException e) {
            throw new PatternSyntaxException("syntax error regex", regex, -1);
        }
    }
}
