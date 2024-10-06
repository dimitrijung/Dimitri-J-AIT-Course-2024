package classwork_06;

// **Задание 1.**
// Задайте в программе две переменные и их значения, которые отвечают за координаты точки на плоскости.
// Определите в какую четверть попадает точка с этими координатами.

public class CoordinateXY {

    public static void main(String[] args) {

    int x = 0;
    int y = 0;

    if (x>=0 & y>=0){
        System.out.println("Point is located in Quadrant 1");
    }

    if (x<=0 & y>=0){
        System.out.println("Point is located in Quadrant 2");
    }

    if (x<=0 & y<=0){
        System.out.println("Point is located in Quadrant 3");
    }

    if (x>=0 & y<=0){
        System.out.println("Point is located in Quadrant 1");
    }
    if (x==0 & y==0){
        System.out.println("Point is located in Coordinate (0;0)");
    }

    } // end of main

} // end of class
