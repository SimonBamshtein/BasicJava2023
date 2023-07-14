package lesson_23.practice.student;

public class Student {
    //аоля класса
    String name;
    int[] marks;


    //методы класса


    public Student(String name) {
        this.name = name;
    }

    public double averageMark(int[] marks) {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum/marks.length;
    }


}
