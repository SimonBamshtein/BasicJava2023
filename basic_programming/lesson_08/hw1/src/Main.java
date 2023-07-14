import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your first and second name");
        String names = scanner.next();
        names = names.trim(); //отсекли случайные пробелы в начале и в конце

        int n = names.length()
        int l = ipAddress.length();

        int nameFirst = ipAddress.indexOf('.'); //нашли номер позиции 1-й точки
        int surnameSecond = ipAddress.indexOf('.', firstDotIndex + 1); // ищем номер позиции 2-й точки

        // если этой точки нет, то вернется значение -1

        if (extraDotIndex != -1) {

            System.out.println("Wrong input, a lot of dots!");
        }

        String byte1 = ipAddress.substring(0, firstDotIndex);
        int num1 = Integer.parseInt(byte1); //преобразование строки в число

        //проверка на диапазон от 0 до 255
        if (num1 < 0 || num1 > 255) {
            System.out.println("Wrong format IP-address");
        }
        String byte2 = ipAddress.substring(firstDotIndex + 1, secondDotIndex);
        int num2 = Integer.parseInt(byte2); //преобразование строки в число
        if (num2 < 0 || num2 > 255) {
            System.out.println("Wrong format IP-address");
        }
        String byte3 = ipAddress.substring(secondDotIndex + 1, thirdDotIndex);
        int num3 = Integer.parseInt(byte3); //преобразование строки в число
        if (num3 < 0 || num3 > 255) {
            System.out.println("Wrong format IP-address");
        }
        String byte4 = ipAddress.substring(thirdDotIndex + 1, l);
        int num4 = Integer.parseInt(byte4); //преобразование строки в число
        if (num4 < 0 || num4 > 255) {
            System.out.println("Wrong format IP-address");
        }

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
}




/* Задание 1
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number");
        int a = scanner.nextInt();
        String b = (a>0) ? "Module of your number is: " + a: "Module of your number is: " + (-a);
        System.out.println(b);
        ______________
        Задание 2
                System.out.println("Please choose type of your waste: wrap, food, paper");
        String waste = scanner.next();

        switch (waste) {
            case "wrap": {
                System.out.println("Please put it in the yellow can");
                break;
            }
            case "food": {
                System.out.println("Please put it in the brown can");
                break;
            }
            case "paper": {
                System.out.println("Please put it in the green can");
                break;
            }
            default: {
                System.out.println("Please put in the black can ");
            }
        } //end switch
 */