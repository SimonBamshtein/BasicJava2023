// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет, чтобы  вычислить корни квадратного уравняния  ax^2 + bx + c = 0 следуйте инстркциям ниже:"); // это для вывода на консоль (на печать) приветствия
//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // вводимые значения попадвют в br

        System.out.println("Введите переменную а: "); // Это приглашение к вводу
        String along = br.readLine(); //читаем строку с клавиатуры в переменную
        int a = Integer.parseInt(along); //преобразовываем строку в число.

        System.out.println("Введите переменную b: "); // Это приглашение к вводу
        String blong = br.readLine(); //читаем строку с клавиатуры в переменную
        int b = Integer.parseInt(blong); //преобразовываем строку в число.

        System.out.println("Введите переменную c: "); // Это приглашение к вводу
        String clong = br.readLine(); //читаем строку с клавиатуры в переменную
        int c = Integer.parseInt(clong); //преобразовываем строку в число.

        double d = b*b - 4*a*c;

        if (d>0) {
            double x1 = (-b - Math.sqrt(d))/(2*a);
            double x2 = (-b + Math.sqrt(d))/(2*a);
            System.out.println("Корни уравнения равны: x1=" + x1 + "; x2 = " +x2);
        }
        else if (d==0) {
            double x = -b/(2*a);
        }
        else if (d<0) {
            System.out.println("Корней нет");
        }

        System.out.println("Спасибо!");
/* ax2 + bx + c = 0
if (d > 0) {
} else if (d == 0) {
} else { // d < 0

        */
/*
        int a = 2;
        double totalKA = (int) Math.pow(ka, a);
        double totalKB = (int) Math.pow(ka, a);

        double x = totalKA + totalKB;
        double c = (int) Math.sqrt(x);

        ___________
System.out.println("Введите длину катета a: "); // Это приглашение к вводу
        String katA = br.readLine(); //читаем строку с клавиатуры в переменную long1
        double ka = Double.parseDouble(katA); //преобразовываем строку в число.

        System.out.println("Введите длину катета b: "); // Это приглашение к вводу
        String katB = br.readLine(); //читаем строку с клавиатуры в переменную long1
        double kb = Double.parseDouble(katB); //преобразовываем строку в число.

        double c = (double) Math.sqrt(ka*ka+kb*kb);
        System.out.println("Гипотенуза равна " + c);
        System.out.println("Спасибо!");
        Задание 1
__________
System.out.println("Введите количество градусов по Фаренгейту: "); // Это приглашение к вводу
        String far1 = br.readLine(); //читаем строку с клавиатуры в переменную
        double f = Double.parseDouble(far1); //преобразовываем строку в число.

        double c = 5*(f-32)/9;
        System.out.println("Градусы в Цельсиях: " + c);
        System.out.println("Спасибо!");
        Задание 2
        System.out.println("Введите длину стороны а: "); // Это приглашение к вводу
        String along = br.readLine(); //читаем строку с клавиатуры в переменную
        int a = Integer.parseInt(along); //преобразовываем строку в число.

        System.out.println("Введите длину стороны b: "); // Это приглашение к вводу
        String blong = br.readLine(); //читаем строку с клавиатуры в переменную
        int b = Integer.parseInt(blong); //преобразовываем строку в число.

        System.out.println("Введите длину стороны c: "); // Это приглашение к вводу
        String clong = br.readLine(); //читаем строку с клавиатуры в переменную
        int c = Integer.parseInt(clong); //преобразовываем строку в число.

        int p = ((a+b+c)/2);

        double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("Площадь треугольника будет равна: " + area);
        System.out.println("Спасибо!");
        Задание 3

*/



    }
}