import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Superman and his choice!");
        // задача на использование строковых переменных в суловиях
        Scanner scanner = new Scanner(System.in);

        System.out.println("left - loose ur horse, right - loose ur honor, forward - ur head");
        System.out.println("What is your choice?");
        String choice = scanner.next();
        // st.equals ("значение") - проверка равенства для String
        if (choice.equals("left")) {
            System.out.println("You've lost your horse!");
        } else if (choice.equals("right")) {
            System.out.println("You've lost your honor!");
        } else if (choice.equals("forward")) {
            System.out.println("You've lost your head!");
        } else {
            System.out.println("Wrong input");
        }

    }
}