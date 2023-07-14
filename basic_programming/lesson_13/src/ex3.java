import java.util.Scanner;
public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input integer positive number: ");
        int n = sc.nextInt();

        int digits = 0;
        int nd = n;

        //занесем цифры числа в массив, а потом распечатаем его. Если надо будет мы его распечатаем в обратном порядке
        // этот цикл считает количество цифр в числе, вычисляем длину нужного нам массива
        while (n > 0) {
            digits++;
            n= n / 10;
        }

        System.out.println(digits);

        int[] digit = new int[digits]; // задаем массив длинной сколько у нас есть цифр в числе n
       //в массив digit заносим цифры числа
        for (int i = 0; i < digit.length; i++) {
            digit[i] = nd % 10; // Остаток от деления на 10 - это и есть, например 767 : 10 => 7 в остатке
            nd = nd /10;
        }
        printArray(digit);
        System.out.println();
        printArrayRevers(digit);
    }
   // ____Methods_____
   public static void printArray (int[] arr) {
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " | ");
       }
   }
    public static void printArrayRevers (int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " | ");
        }
    }
//________end of Methods________
}
