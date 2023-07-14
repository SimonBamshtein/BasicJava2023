package lesson_18.practice;

import lesson_17.computer.Computer;
import lesson_18.practice.model.computer;

public class ComputedCompareAppl {
    public static void main(String[] args) {

        computer comp1 = new computer("i5", 8, 256, "Lenovo");
        computer comp2 = new computer("i5", 8, 256, "Lenovo");

        System.out.println(comp1 == comp2);

        System.out.println(comp1.equals(comp2));

        computer comp3 = new computer("i5", 8, 256, "Asus");
        System.out.println(comp1.equals(comp3));

        computer comp4 = new computer("i7", 16, 512, "Asus");
        computer comp5 = new computer("I7", 8, 256, "ASUS");

        computer[] arrOfComps = new computer[5];
        arrOfComps[0] = comp1;
        arrOfComps[1] = comp2;
        arrOfComps[2] = comp3;
        arrOfComps[3] = comp4;
        arrOfComps[4] = comp5;

        printArray(arrOfComps); //печатаем массив обьектов

        int sum = 0;
        for (int i = 0; i < arrOfComps.length; i++) {
            sum = sum + arrOfComps[i].getSsd();
        }
        System.out.println("Total SSD memory: " + sum);

    }
    //___Methods___

    //сложим все ssd


    // Печать массива
    public static void printArray (Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
