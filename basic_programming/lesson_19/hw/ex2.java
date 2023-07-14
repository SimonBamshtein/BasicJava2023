package lesson_19.hw;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a natural number: ");
        int n = scanner.nextInt();

        int[] divisors = findDivisors(n);

        System.out.println("Divisors of " + n + ":");
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
    }

    public static int[] findDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] divisors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors[index] = i;
                index++;
            }
        }

        return divisors;
    }
}