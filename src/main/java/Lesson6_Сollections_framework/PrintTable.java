package Lesson6_Сollections_framework;

public class PrintTable {
    public static void multiplicationTable() {
        int num1 = 10;
        int num2 = 10;
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
