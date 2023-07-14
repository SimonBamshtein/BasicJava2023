// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Perimeter of Rectangle with method");

        int a = 100; //первая сторона прямоугольника

        int b = 300; //вторая сторона прямоугольника

        int per = perimeter(a, b); //вызов метода




        System.out.println("Perimeter = " + per);



    } //конец метода main
    //_________Methods_____________
    public static int perimeter(int x, int y){ //метод получает на вход два целых числа
        //int p = (x + y) * 2;
        //return p;
        return (x+y)*2; // возвращает результат
    }


    //________end of Methods________

} //конец класса Main