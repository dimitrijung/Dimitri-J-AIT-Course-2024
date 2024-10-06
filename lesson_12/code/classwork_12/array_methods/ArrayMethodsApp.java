package classwork_12.array_methods;

import java.util.Scanner;

public class ArrayMethodsApp {

    public static void main(String[] args) {

        int[] myArray = ArrayMethods.fillArray(10,20,30); //вызываем метод который лежит в ArrayMethods под названием fillArray.

        ArrayMethods.printArray(myArray);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number for searching:");
        int n = scanner.nextInt();

        boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        System.out.println("Number " + n + " is in Array: " + isInArray);


    }// end of main

}// end of class
