package homework_20;

// Напишите программу, которая запрашивает у пользователя строку, содержащую целые числа, и выводит сумму всех этих введенных чисел.
// Используйте классы-обёртки для преобразования строк в соответствующие примитивы.

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your  numbers separated by commas: ");
        String inputNumbers = scanner.nextLine();

        String[] numbers = inputNumbers.split(",");

        int sum = 0;

        for (String num : numbers){
            sum = sum + Integer.parseInt(num);
        }
        System.out.println(sum);

//        for (int i = 0; i < numbers.length; i++) {
//            sum = sum + numbers[i];
//        }
//        System.out.println(sum);


    } // end of main
} // end of class
