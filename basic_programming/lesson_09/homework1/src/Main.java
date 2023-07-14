import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// Программа получает на вход строку и число повторений этой строки Программа должна вывести эту строку нужное количество раз.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string");
        String s = scanner.nextLine();
        System.out.println("Please input amount of repeats");
        int r = scanner.nextInt();

        while (r > 0) {
            System.out.println(s);
            r--;
        }
    }
}
/*
Scanner scanner = new Scanner(System.in);
        System.out.println("Please input string");
        String s = scanner.nextLine();
        System.out.println("Please input amount of repeats");
        int r = scanner.nextInt();

        do {
            System.out.println(s);
            r--;
        } while (r > 0);

 */