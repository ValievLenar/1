package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double a = scanner.nextInt();
            double b = scanner.nextInt();

            if (b == 0)
                break;

            System.out.println(a / b);
        }
    }
}
