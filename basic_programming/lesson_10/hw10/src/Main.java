import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("How many numbers would you like to input?");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Input numbers: ");
        int pos = 0;
        int neg = 0;
        int zer = 0;

        int i = 0;
        while (i<n) {
            int num = scanner.nextInt();
            if (num>0) {
                pos++;
            } else if (num<0) {
                neg++;
            } else {
                zer++;
            }
            i++;
        }//end while
        System.out.println("Pos: " + pos);
        System.out.println("Neg: " + neg);
        System.out.println("Zer: " + zer);

    }
}