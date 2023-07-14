import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("If - else practice - NEXTNEXT");
        //3 задание practice
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number ");
        int b = scanner.nextInt();
        System.out.println("Input 3rd number ");
        int c = scanner.nextInt();

        int maxi = maxABC(3, 4, 5); // вызов метода и передали на вход 3 числа


        System.out.println("Max = " + maxi); //print result

    }
    //_______Methods_________
    public static int maxABC (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
}