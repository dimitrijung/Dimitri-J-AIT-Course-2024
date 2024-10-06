package homework_06;

// Задача 2
// Пользователь с клавиатуры вводит число от 1 до 12, программа сообщает, какому времени года принадлежит введенный месяц.

import java.util.Scanner;

public class Month {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // вызываем сканер для ввода числа через клавиатуру
        System.out.println("Enter a number (1...12): ");  // информационная строка высвечивается на экране
        int number = scanner.nextInt(); // переменная куда сканнер вложит заданую цыфру

        switch (number){
            case 1 ->{
                System.out.println("January");
            }
            case 2 ->{
                System.out.println("February");
            }
            case 3 ->{
                System.out.println("March");
            }
            case 4 ->{
                System.out.println("April");
            }
            case 5 ->{
                System.out.println("May");
            }
            case 6 ->{
                System.out.println("June");
            }
            case 7 ->{
                System.out.println("July");
            }
            case 8 ->{
                System.out.println("August");
            }
            case 9 ->{
                System.out.println("September");
            }
            case 10 ->{
                System.out.println("October");
            }
            case 11 ->{
                System.out.println("November");
            }
            case 12 ->{
                System.out.println("December");
            }
            default -> {
                System.out.println("Your number is not correctly.");
            }
        }
        switch (number){
            case 1, 2, 12 ->{
                System.out.println("Yearseason Winter");
            }
            case 3, 4, 5 ->{
                System.out.println("Yearseason Spring");
            }
            case 6, 7, 8 ->{
                System.out.println("Yearseason Summer");
            }
            case 9, 10, 11 ->{
                System.out.println("Yearseason Fall");
            }
        }
    } // end of main
} // end of class
