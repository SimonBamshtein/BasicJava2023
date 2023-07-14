package lesson_19.practice;
import java.util.Scanner;

public class InPrime {
    public static void main(String[] args) {
        //Написать метод, определяющий, является ли число простым (primary).
        //Проcтое число - это число, которое делится только на себя и 1. Примеры: 2, 7, 11, 19, 47.
        // На входе? - целое, положительное число int n
        // На выходе? - boolean, ответ на поставленный вопрос
        // ключевой алгоритм - перебрать все числа от 2 до (n-1) и проверить разделилось ли яисло на любое из них
        // если этого не произошло? тогда это число n - простое, иначе - оно НЕпростое

            Scanner scanner = new Scanner(System.in);

        System.out.println("Input integer positive number: ");
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        primeCheck(n);
    }


        public static void primeCheck(int number) {
            boolean isPrime = true;
            for (int i = 2; i < number - 1; i++) {
                if (number % i == 0) { // если хотя бы раз разделилось, то
                    isPrime = false; //обьявим что число НЕпростое и можно выйти из цикла
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Number " + number + " is prime.");
            } else {
                System.out.println("Number " + number + " is not prime.");
            }
        }
    }

/*
  boolean isPrime = true;
                for (int i = 2; i < n - 1; i++) {
                    if (n % i == 0) { // если хотя бы раз разделилось, то
                        isPrime = false;  //обьявим что число НЕпростое и можно выйти из цикла
                    }
                }
                if (isPrime) {
                    System.out.println("Number " + n + " is prime");
                } else{
                    System.out.println("Number " + n + " is not prime");
                }
            }
 */