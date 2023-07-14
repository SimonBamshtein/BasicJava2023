import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Чтобы узнать сущемствует ли треугольник с введенными сторонами следуйте инструкицям ниже: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость товара A: ");
        int x = scanner.nextInt();;

        System.out.println("Введите скидку на товар A: ");
        double d = scanner.nextDouble();

        System.out.println("Введите количество товара A: "); // Это приглашение к вводу
        int n = scanner.nextInt();

        //b

        System.out.println("Введите стоимость товара B: "); // Это приглашение к вводу
        int y = scanner.nextInt();

        System.out.println("Введите скидку на товар B: "); // Это приглашение к вводу
        double c = scanner.nextInt();

        System.out.println("Введите количество товара B: "); // Это приглашение к вводу
        int m = scanner.nextInt();


        if (x > 0 & d > 0 & n > 0 & y > 0 & c > 0 & m > 0) {

            double tcostA = ((x * d)/100);
            double cA = (x - tcostA) * n;
            System.out.println("Итоговая стоимость товара A будет равна " + cA);

            double tcostB = ((y * c) /100);
            double cB = (y - tcostB) * m;
            System.out.println("Итоговая стоимость товара B будет равна " + cB);

            System.out.println("Итоговая сумма покупки составит " + (cA + cB));

        } else {
            System.out.println("Стоимость, скидка или количество не могут быть отрицательными - введите корректное число");
        }

    }
}