import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
//Вводится положительное целое число, найдите сумму его цифр.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input integer positive number");
        int a = scanner.nextInt();
        int sum = 0;

        while (a != 0 ) {
            sum = sum + a % 10;
            a = a/10;
        }
        System.out.println(sum);

    }
}
