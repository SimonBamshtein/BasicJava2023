import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        System.out.println("Чтобы узнать 3 угол треугольника следуйте инструкциям ниже: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st corner");
        int a = scanner.nextInt();
        System.out.println("Input 2nd corner");
        int b = scanner.nextInt();
        int c = 180 - a - b;

        if (a < 90 & b < 90) {
            System.out.println("3rd corner is: " + c);

        } else {
            System.out.println("Triangle does not  exist");
        }



    }
}