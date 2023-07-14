import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Чтобы узнать сущемствует ли треугольник с введенными сторонами следуйте инструкицям ниже: ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st side");
        int a = scanner.nextInt();
        System.out.println("Input 2nd side");
        int b = scanner.nextInt();
        System.out.println("Input 3rd side");
        int c = scanner.nextInt();

        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Triangle is exist ");

        } else {
            System.out.println("Triangle does not exist :(");
        }

    }
}