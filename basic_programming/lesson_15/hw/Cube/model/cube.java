package hw.Cube.model;

public class cube {

                //Шаг 1 - определяем полe класса
                public double a;

                //Шаг 2 - определяем метод

                //Конструктор класса Cube
                public cube(double a) {
                        this.a = a;
                }

                //метод установки значеня поля класса

                public void setA(double a) {
                        this.a = a;
                }

                //метод для вычисления периметра
                public double perimeter (double a) {
                        return 12 * a;
                }   //метод для вычисления площади
                public double square (double a) {
                        return 6 * (a*a);
                }//метод для вычисления обьема
                public double volume (double a) {
                        return a*a*a;
                }



}
