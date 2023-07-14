import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {

//4 урок дз
        //Задание 5
                System.out.println("Привет, чтобы посчитать итоговую стоимость покупки следуйте инстркциям ниже:"); // это для вывода на консоль (на печать) приветствия
//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // вводимые значения попадвют в br
        //a
        System.out.println("Введите стоимость товара A: "); // Это приглашение к вводу
        String costX = br.readLine(); //читаем строку с клавиатуры в переменную long1
        int x = Integer.parseInt(costX); //преобразовываем строку в число.

        System.out.println("Введите скидку на товар A: "); // Это приглашение к вводу
        String discD = br.readLine(); //читаем строку с клавиатуры в переменную long1
        double d = Integer.parseInt(discD); //преобразовываем строку в число.

        System.out.println("Введите количество товара A: "); // Это приглашение к вводу
        String amoN = br.readLine(); //читаем строку с клавиатуры в переменную long1
        int n = Integer.parseInt(amoN); //преобразовываем строку в число.

        //b

        System.out.println("Введите стоимость товара B: "); // Это приглашение к вводу
        String costY = br.readLine(); //читаем строку с клавиатуры в переменную long1
        int y = Integer.parseInt(costY); //преобразовываем строку в число.

        System.out.println("Введите скидку на товар B: "); // Это приглашение к вводу
        String discC = br.readLine(); //читаем строку с клавиатуры в переменную long1
        double c = Integer.parseInt(discC); //преобразовываем строку в число.

        System.out.println("Введите количество товара B: "); // Это приглашение к вводу
        String amoM = br.readLine(); //читаем строку с клавиатуры в переменную long1
        int m = Integer.parseInt(amoM); //преобразовываем строку в число.


        double tcostA = ((x * d)/100);
        double cA = (x - tcostA) * n;
        System.out.println("Итоговая стоимость товара A будет равна " + cA);

        double tcostB = ((y * c) /100);
        double cB = (y - tcostB) * m;
        System.out.println("Итоговая стоимость товара B будет равна " + cB);

        System.out.println("Итоговая сумма покупки составит " + (cA + cB));







/*
        int a = 2;
        int pow2 = (int) Math.pow(l1, a);
        System.out.println("Площадь квадрата равна " + pow2);

        int b = 3;
        int pow3 = (int) Math.pow(l1, b);

        System.out.println("Спасибо!");

 */




/*
        System.out.println("Введите ширину прямоугольника: "); // Это приглашение к вводу
        String hight2 = br.readLine(); //читаем строку с клавиатуры
        System.out.println("Вы ввели ” + hight2 + ” - это ширина вашего прямоугольника"); // Это сообщение пользователю
        int h1 = Integer.parseInt(hight2); //преобразовываем строку в число.
        int t1 = 2;
        System.out.println(" Ширина прямоугольника  " + l1 + " сложить с длиной прямоугольника ” + h1 + ” и умножить на 2" + " получилось " + (t1 * (l1 + h1)) + " - это периметр вашего прямоугольника" );
        System.out.println(" Ширина прямоугольника  " + l1 + " умножить на длину прямоугольника " + h1 + " получилось " + (l1 * h1) + " - это площадь вашего прямоугольника" );
        System.out.println("Спасибо!“);
        __________
           System.out.println("Привет, чтобы посчитать площадь квадрата и обьем куба следуйте инстркциям ниже:"); // это для вывода на консоль (на печать) приветствия
//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // вводимые значения попадвют в br
        System.out.println("Введите длину стороны квадрата: "); // Это приглашение к вводу
        String long1 = br.readLine(); //читаем строку с клавиатуры в переменную long1
        System.out.println("Вы ввели " + long1 + " - это длина стороны квадрата и куба"); // Это сообщение пользователю

        int l1 = Integer.parseInt(long1); //преобразовываем строку в число.
        int a = 2;
        int pow2 = (int) Math.pow(l1, a);
        System.out.println("Площадь квадрата равна " + pow2);

        int b = 3;
        int pow3 = (int) Math.pow(l1, b);

        System.out.println("Спасибо!");

Задание 1
_____________
  System.out.println("Привет, чтобы перевести радианы в градусы следуйте инстркциям ниже:"); // это для вывода на консоль (на печать) приветствия
//        Reader inputStreamReader = new InputStreamReader(System.in); // готовим ввод с клавиатуры
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // готовим ввод с клавиатуры
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // вводимые значения попадвют в br
        System.out.println("Введите значение радиана: "); // Это приглашение к вводу
        String rad1 = br.readLine(); //читаем строку с клавиатуры в переменную long1
        System.out.println("Вы ввели " + rad1 + " - это значение радиана"); // Это сообщение пользователю
        int r1 = Integer.parseInt(rad1); //преобразовываем строку в число.

        double P = Math.PI;
        System.out.println(r1 + " радиан получится: " + (r1 * (180/P)) + " градусов");
        System.out.println("Спасибо!");
Задание 2
__________

        double mon = 26.0d;
        double tue = 27.0d;
        double wed = 28.0d;
        double thu = 32.0d;
        double fri = 31.0d;
        double sat = 28.0d;
        double sun = 28.0d;

        double midT = mon+tue+wed+thu+fri+sat+sun;
        double daysN = 7.0d;
        System.out.println("Средняя температура в городе Телявив за прошедшую неделю составляла: " + (midT/daysN));

Задание 3
__________
public static void main(String[] args) throws IOException {

        int A = 1000;
        int B = 500;
        int c = (A+B)/10;
        System.out.println("Итоговая стоимость A + B со скидкой будет равна " + ((A+B) - c));
        System.out.println("Абсолютная величина скидки равна " + c);
        System.out.println("Спасибо!");
Задание 4
*/
    }
}
