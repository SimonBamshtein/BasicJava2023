import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("If - else practice");
        //1 задание practice
        Scanner scanner = new Scanner(System.in); //switch on scanner

        System.out.println("Please input number");
        int number = scanner.nextInt();

        if (number % 2 == 0 ) { //check division by 2
            System.out.println("This number " + number + " is even."); // massage for user
        } else  {
            System.out.println("This number " + number + " is odd."); // massage for user
        }


        if (number > 0) { //check negative or positive
            System.out.println("This number " + number + " is positive"); // massage for user
        } else  {
            System.out.println("This number " + number + " is negative "); // massage for user
        }

        //even and positive number


        if (number > 0 & number % 2 == 0) { //check negative or positive
            System.out.println("This number " + number + " is positive and even "); // massage for user
        }

        System.out.println("How old are you?"); //question for user
        int age = scanner.nextInt();

        if(age < 18) {
            System.out.println("You have to finish middle school!");
        } else {
            System.out.println("What is your date of birth?");//q for user
            String dayofB = scanner.next();
            System.out.println("Your date of birth is: " + dayofB);
        }





    }
}