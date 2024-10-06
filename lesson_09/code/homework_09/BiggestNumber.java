package homework_09;

// Задача 2.
// Написать программу, выводящую на экран максимальное из трех целых чисел.
// Числа задайте самостоятельно внутри программы.
// Решите эту задачу с помощью if ... else и также с помощью тернарного оператора.

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        // Ввод трех чисел через сканнер
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 1st number:");
        int number1 = scanner.nextInt();

        System.out.println("Input 2nd number:");
        int number2 = scanner.nextInt();

        System.out.println("Input 3rd number:");
        int number3 = scanner.nextInt();

        // Решение задачи с помощью тернарного оператора
        int max = (number1 > number2) ? number1 : number2;

        int max1 = (max > number3) ? max : number3;

        System.out.println("Max with ternary operator = " + max1);

        // Решение задачи с помощью if...else  оператора
        int max2;

        if (number1 > number2){ //&& number1 > number3){
             max2 = number1;
        }
        else if (number1 > number3){ // && number2 > number3) {
            max2 = number1;
        }
        else {
            max2 = number3;
        }

        System.out.println("Max with if...else operator = " + max2);

    } // end of main
} // end of class
