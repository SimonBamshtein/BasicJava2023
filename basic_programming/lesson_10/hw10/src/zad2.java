import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input amount of your contribution");
        double a = scanner.nextDouble();
        System.out.println("Please input for how many years do you want to hold it");
        double y = scanner.nextDouble();
        double a1 = a;
        while (y > 0) {
            a1= (a1/100) * 3;
            a = a +a1;
            y--;
        }
        System.out.println("Your amount in total: " + a);
    }
}