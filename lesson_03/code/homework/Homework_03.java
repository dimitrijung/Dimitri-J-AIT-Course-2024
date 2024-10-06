package homework;

// Ex1: Метод вычисляющий площадь квадрата по его стороне
// Ex2: Метод вычисляющий площадь круга по его радиусу
// Ex3: Метод вычисляющий периметр прямоугольника по двум сторонам


public class Homework_03 {

    public static void main(String[] args) {

        double a = 500;
        double r = 200;
        double b = 1000;
        double c = 2000;

        //Solution Ex1: "Метод вычисляющий площадь квадрата по его стороне"
        double areaQuarter = areaOfQuarter(a);
        System.out.println("Площадь квадрата со стороной " + a + " составляет " + areaQuarter);

        //Solution EX2: "Метод вычисляющий площадь круга по его радиусу"
        double areaCircel = areaOfCircel(r);
        System.out.println("Площадь круга для R = " + r + " равна " + areaCircel);

        //Solution EX3: "Метод вычисляющий периметр прямоугольника по двум сторонам"
        double areaRectangle = areaOfRectangle(b, c);
        System.out.println("Периметр прямоугольника со сторонами b = " + b + " и c = " + c +  " равен " + areaRectangle);

    } // end of main

    public static double areaOfQuarter(double a) {
        double res = a * 2;                                 // Метод вычисляющий площадь квадрата по его стороне
        return res;
    }

    public static double areaOfCircel(double r) {
        double res = Math.PI * Math.pow(r, 2);              //Метод вычисляющий площадь круга по его радиусу
        return res;
    }

    public static double areaOfRectangle(double b, double c) {
        double res = 2 * (b + c);                           // Метод вычисляющий периметр прямоугольника по двум сторонам
        return res;
    }

} //end of class
