public class hw1 {
    public static void main(String[] args) {
        int[] num = new int[100];

        int a = 1, b = 100; //обозначил интервалы от 1 до 100 рандомных чисел массива

        for (int i = 0; i < num.length; i++) {
            //заполним элементы массива случайными натуральными числами в интервале от 1 до 100
            num[i] = (int)(Math.random() * (b - a +1) + a);
        }
        int sumX = 0;
        int sumY = 0;
        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0) {
                sumX = sumX +i;
            }
        }
        System.out.println(sumX);

    }
}
