package homework_08;

//Задача 3.
// Определение времени суток.
// Напишите программу, которая принимает на вход текущий час (от 0 до 23) и выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).

import java.util.Scanner;

public class TimeOfDay {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input time: ");

        int time = scanner.nextInt();

        switch (time){
            case 1,2,3,4,5->{
                System.out.println("Good night!");
            }
            case 6,7,8,9,10,11->{
                System.out.println("Good morning!");
            }
            case 12,13,14,15,16,17,18->{
                System.out.println("Good day!");
            }
            case 19,20,21,22,23,24->{
                System.out.println("Good evening!");
            }
        }
    } //end of main
} //end of class
