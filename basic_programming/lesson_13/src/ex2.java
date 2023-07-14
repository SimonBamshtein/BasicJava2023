import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
    int[] num = new int[10];
    Scanner scanner = new Scanner(System.in);
    int a = 1, b = 100;

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами в интервале от 1 до 100
            num[i] = (int)(Math.random() * (b - a +1) + a);
        }
        printArray(num); // вызываем метод и печатаем массив
        System.out.println();

        System.out.println("Input number for search (integer and positive): ");
        int n = scanner.nextInt();

        while ( n < 0) {
            System.out.println("Wrong input! Please try again");
             n = scanner.nextInt(); // даем возможность сделать ввод числа повторно

        }

        //вызов метода поиска и печать результата

        if (searchInArray(num, n)) {
            System.out.println(" We've found the number " + searchIndexArray(num, n));
        } else {
            System.out.println(" We have not found the number " + searchIndexArray(num, n));
        }

    }
    //____Methods_____
    public static int searchIndexArray (int[] num, int n) {
        int index = -1; //несуществующий индекс
        for (int i = 0; i < num.length; i++) {
            // проверяем что в массиве есть искомое число
            if ( n == num[i]) {
                index = i;
                return index;
            }
        }
        return index;
    }
    public static boolean searchInArray (int[] num, int n) {
        boolean res = false;
        for (int i = 0; i < num.length; i++) {
         // проверяем что в массиве есть искомое число
            if ( n == num[i]) {
                return true;
         }
        }
        return false;
    }
    public static void printArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " | ");
        }
    }

    //____End of Methods____
}
