package classwork_12;

// Задайте массив из 10 случайных натуральных чисел в интервале от 1 до 100.
// Запросите у пользователя какое-то натуральное число.
// Определите, есть ли это число в массиве.
// Создайте и используйте метод searchInArray, который получает на вход массив и искомое число, а возвращает
// ответ - нашлось ли это число в массиве.

import java.util.Random;
import java.util.Scanner;

public class
RandomNumber {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numbers = new int[10];

// ---------------Fill in Array with numbers---------------
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt(100) + 1;
        }
// -------------------Print Array---------------------
        printArray(numbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive number!");
        int n = scanner.nextInt();                                  //ввод пользователя мы сохранаем в переменную "n".

        boolean isInArray = searchInArray(numbers, n);
        System.out.println("Number " + n + " is in array: " +  isInArray);

    }// end of main

    private static boolean searchInArray( int[] numbers, int n ) {
        for (int i = 0; i < numbers.length; i++) {
             if (numbers[i]==n){
                 return true;
             }// end of if
        }// end of for
        return false;
    }// end of Method searchInArray

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }// end of for
        System.out.println();
        System.out.println("----------------------------");
    }//end of Method printArray

}// end of class
