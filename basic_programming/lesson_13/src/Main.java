

public class Main {
    public static void main(String[] args) {
        //Задача 1.
        // Имеются оценки абитуриента из его аттестата, всего 12 оценок.
        // Найдите средний балл абитуриента.
        System.out.println("Average marks of student ");
        int[] array = {4,3,3,4,5,3,4,5,4,5,3,5};
        //для нахождения среднего балла нужно суммировать все оценки
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i]; //суммируем оценки
        }
// для назождения среднего балла делим сумму на их количество (12)
        double result = sum / array.length;
        System.out.println("Средний балл: " + result);
        System.out.printf("Средний балл:  %.2f",  result);

    }
}