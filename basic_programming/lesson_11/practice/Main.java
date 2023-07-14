import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // тело основного метода main
        System.out.println("Methods practice ");

        //определить количество цифр у натурального числа  (делим число на 10 пока остаток от деления > 0)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer positive number: ");
        int num = scanner.nextInt();

        int digits = numberOfDigits(num); //вызов метода и передача ему на вход параметра

        System.out.println("Amount of digits: " + digits);


        int sumDigits = sumOfDigits(num);
        System.out.println("Sum of digits: " + sumDigits);


        //сумма цифр

    }
    //______Methods__________

    public static int numberOfDigits (int n) {
        int count = 1; //инициировал счетчик цифр
        while (n / 10 > 0){
            count++; // считаю количество цифр
            n = n / 10; // целочисленное деление (нужно учесть 0)
        }//end of while
        return count;
    }//end of numberOfDigits


    public static int sumOfDigits (int n) {
        int sum = 0;
        while (n * 10  / 10 > 0) {
            sum = sum + n % 10; // это цифра числа, их суммируем
            n = n / 10; // уменьшаем число в 10 раз
        } // end of while
        return sum;
    } //end of sumOfDigits
    //_______ End of Methods_________
}