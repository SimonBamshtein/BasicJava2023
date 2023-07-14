import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("To count factorial of n please input n");
        int n = scanner.nextInt();

    }
    public static int factorialOfN (int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
             int result *= i;
            i++;
        }
        return result;
    }//end of method
}
