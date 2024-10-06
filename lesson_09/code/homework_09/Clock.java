package homework_09;

// Задача 1.
// В программе задаются часы, минуты и секунды.
// Нужно вывести общее количество секунд, прошедших с начала суток.
// Вычисление произведите в методе, который получает на вход часы, минуты и секунды.

import java.util.Scanner;

public class Clock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input hours:");
        int hours = scanner.nextInt();

        System.out.println("Input minutes:");
        int minutes = scanner.nextInt();

        System.out.println("Input seconds:");
        int seconds = scanner.nextInt();

        double sec = calculateSeconds (hours, minutes, seconds);
        System.out.println("Time in seconds is: " + sec + " s");

    } // end of main

    private static double calculateSeconds (int hours, int minutes, int seconds ) {
        int res = (hours * 3600) + (minutes * 60) + seconds;
        return res;
    }

} // end of class
