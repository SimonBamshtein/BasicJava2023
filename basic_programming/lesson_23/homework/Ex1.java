package lesson_23.homework;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = generateRandom(100, -10, 10);


        System.out.println(countPosNum(array));
        System.out.println(countNegNum(array));
        System.out.println(countEven(array));
        System.out.println(countZero(array));
    }
    //метод рандомного заполнения массива
    public static int[] generateRandom(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size ; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }
    //метод подсчета положительных чисел
    public static int countPosNum(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length ; i++) {
            if (array[i] > 0) {
                count++;
            }
        }
        return count;
    }
    //метод подсчета отрицательных чисел в массиве
    public static int countNegNum(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                count++;
            }
        }

        return count;
    }
    //подсчет четных чисел
    public static int countEven(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }
//количество нулей
    public static int countZero(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }

        return count;
    }




}
