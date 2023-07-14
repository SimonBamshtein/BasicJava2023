import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Choose operation +, -, *, /");
        String operation = scanner.next();


        //int operation = scanner.nextInt(); //считываем вид операции

        switch (operation) {
            case "+": {
                System.out.println("Sum is " + (a + b));
                break;
            }
            case "-": {
                System.out.println("Subtraction is " + (a - b));
                break;
            }
            case "*": {
                System.out.println("Multiplication is "  + (a * b));
                break;
            }
            case "/": {
                double div = (double) a / b;
                System.out.println("Division is " + div);
                break;
            }
            default: {
                System.out.println("Wrong input!");
            } //end of switch
        }
    }
}
/*
 System.out.println("Input 1st number: ");
        int a = scanner.nextInt();
        System.out.println("Input 2nd number: ");
        int b = scanner.nextInt();
        System.out.println("Choose operation 1 - +, 2 - -, 3 - *, 4 - /");
        int operation = scanner.nextInt(); //считываем вид операции

        switch (operation) {
            case 1: {
                System.out.println("Sum is " + (a + b));
                break;
            }
            case 2: {
                System.out.println("Subtraction is " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Multiplication is"  + (a * b));
                break;
            }
            case 4: {
                double div = (double) a / b;
                System.out.println("Division is " + div);
                break;
            }
            default: {
                System.out.println("Wrong input!");
            } //end of switch
        }
 */