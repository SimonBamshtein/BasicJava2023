import java.util.Scanner;
public class numbers {
    public static void main(String[] args) {
//Задача 4. Пользователь вводит натуральное число (целое, положительное). Выясните, сколько цифр в числе.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer and positive number");
        int n = scanner.nextInt();
        // Алгоритм:
        // нужно делить число нацело на 10 до теъ пор пока частное больше 10
        // 245 / 10 = 24
        // 24 / 10 = 2
        // 2 / 10 = 0 целых
        // на каждом шагу увеличиваем счетчик на 1

        int count = 0; // начальное значение
        int div = n;

        while (div > 0 ) { // пока частное больше нуля
            div = div / 10; //делим на 10, вычисляем частное
            count++;
            System.out.println(count);
        } //end of while
        System.out.println("Number of digits is: " + count);
    }
}
