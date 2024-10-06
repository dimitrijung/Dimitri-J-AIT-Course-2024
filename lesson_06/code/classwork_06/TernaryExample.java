package classwork_06;

// **Задание 2.**
// В программе задаются два целых числа.
// Найдите минимальное из них с помощью тернарного оператора.
// Дополните программу возможностью ввода чисел пользователем.

import java.util.Scanner;

public class TernaryExample {

    public static void main(String[] args) {

    int a = 300;
    int b = 200;

    int min = (a < b) ? a : b; // ternary operator

        System.out.println("Min = " + min);

    // input data
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input 1st number:");
    a = scanner.nextInt(); // получаем "a =" с клавиатуры число от Человека

    System.out.println("Input 2st number:");
    b = scanner.nextInt(); // получаем "b =" с клавиатуры число от Человека

    // call Method minAB
    min = minAB(a, b);
        System.out.println("Min = " + min);

    } // end of main

    // Method minAB
    public static int minAB(int a, int b){
        return (a < b) ? a : b;
    }

} // end of class
