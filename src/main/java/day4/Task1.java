package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        Random rand = new Random();

        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;

        for (int x : array) {
            x = rand.nextInt(10);
            System.out.print(x + " ");
            if (x > 8) {
                counter8++;
            }
            if (x == 1) {
                counter1++;
            }
            if (x % 2 == 0) {
                counterEven++;
            }
            if (x % 2 != 0) {
                System.out.println();
            }
            sum += x;
        }
        System.out.println();
        System.out.println("Длине массива: " + arrayLength);
        System.out.println("Количестве чисел больше 8: " + counter8);
        System.out.println("Количестве чисел равных 1: " + counter1);
        System.out.println("Количестве четных чисел: " + counterEven);
        System.out.println("Количестве нечетных чисел: " + counterOdd);
        System.out.println("Сумме всех элементов массива: " + sum);
    }
}