import java.util.Scanner;
public class string1 {
    public static void main(String[] args) {
        //Задача 5. Пользователь вводит строку. Распечатайте каждую букву строки на новой строчке.
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("String: " + s);
        int l = s.length(); // определили длину введенной строки
        System.out.println("Length of string is: " + l); //напечатали длину строки
        int pointer = 0;

        while ( l > 0 ) {
            System.out.println(s.charAt(pointer)); // печатаем букву из строки
            pointer++; //двигаем указатель по строке вправа
            l--; //уменьшаем длину строки
        }
        System.out.println(pointer);
    }
}
