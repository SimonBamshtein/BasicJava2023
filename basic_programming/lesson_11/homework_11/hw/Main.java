import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("1 ex!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("To count sum of numbers between 1 to 1/n please input n");
        int a = scanner.nextInt();
        double sumOfNumbers = sumBetween(a);
        System.out.println(sumOfNumbers);
    }
    public static double sumBetween (int n) {
        double sum = 0; // инициировал сумму цифр
        double i = n;
        while (i > 0) {
            sum = sum + 1/i; // суммируем 1 + 1/2 + 1/3... 1/i
            i--; // считаем пока i-1>0
        }//end of while
        return sum;
    } //end of sumBetween
}
