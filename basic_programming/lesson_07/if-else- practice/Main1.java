import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        System.out.println("If - else practice - NEXT");
        //2 задание practice
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number ");
        int b = scanner.nextInt();

        int sum;

        if (a == b) {
            int sum1 = 2*(a+b);
            System.out.println("sum = " + sum1);
        } else {
            int sum2 = a+b;
            System.out.println("sum = " + sum2);

        }






    }
}