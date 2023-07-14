public class EX2 {
    public static void main(String[] args) {

        int [] numbers = { 56, 73, 15, -10, 37, -14, 25, 65, 33, 38 }; // название заданного массива

        int max = numbers[0]; //временно назначеный максимум в виде первого элемента массива

        int beg = -1; // также можеть быть 0 - пока еще не найденный элемент

        for (int i = 0; i < numbers.length ; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; //находим максимальный элемент
                beg = i; //индекс макс
            }
        }
        System.out.println("Max = " + max + " Index of max: " + beg);
    }
}
