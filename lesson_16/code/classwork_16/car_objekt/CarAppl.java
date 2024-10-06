package classwork_16.car_objekt;

import classwork_16.car_objekt.model.Car;

public class CarAppl {

    public static void main(String[] args) {

        Car myCar = new Car("VW", 2014, 15000, "red",false); // create object with real data

        myCar.toString();

        System.out.println(myCar);

        myCar.move();
        myCar.stop();

    } // end of main
} // end of class
