package homework_17;

import homework_17.model.Cube;

public class CubeAppl {
    public static void main(String[] args) {

        Cube cube1 = new Cube(3);
        Cube cube2 = new Cube(6);
        Cube cube3 = new Cube(8);

        System.out.println("Cube 1");
        System.out.println("Perimeter : " + cube1.perimeter());
        System.out.println("Area: " + cube1.area());
        System.out.println("Volume: " + cube1.volume());

        System.out.println("\nCube 2");
        System.out.println("Perimeter:" + cube2.perimeter());
        System.out.println("Area :" + cube2.area());
        System.out.println("Volume :" + cube2.volume());

        System.out.println("\nCube 3");
        System.out.println("Perimeter:" + cube3.perimeter());
        System.out.println("Area :" + cube3.area());
        System.out.println("Volume :" + cube3.volume());

    } // end of main
} // end of class
