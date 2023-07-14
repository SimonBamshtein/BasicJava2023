package hw.Cube.controller;
import hw.Cube.model.cube;

public class CubeAppl {
    public static void main(String[] args) {

        cube cube1 = new cube(4); //создаем обьект типа cube
        System.out.println("Perimeter of cube is: " + cube1.perimeter(4));
        System.out.println("Square of cube is: " + cube1.square(4));
        System.out.println("Volume of cube is: " + cube1.volume(4));

        System.out.println();

        cube cube2 = new cube(6);
        System.out.println("Perimeter of cube is: " + cube1.perimeter(6));
        System.out.println("Square of cube is: " + cube1.square(6));
        System.out.println("Volume of cube is: " + cube1.volume(6));

    }
}
