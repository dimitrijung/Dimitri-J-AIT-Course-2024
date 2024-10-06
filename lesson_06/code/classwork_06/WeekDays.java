package classwork_06;

// Написать программу, которая по введенной цифре от 1 до 7 определяет день недели.
// Второй вариант - на цифры от 1 до 5 программа сообщает, что это будний день, а на 6 и 7, что это выходной.

import java.util.Scanner;

public class WeekDays {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input number of day: ");
        int weekDay = scanner.nextInt();

        switch (weekDay) {
            case 1 -> {
                System.out.println("Today is Monday");
            }
            case 2 -> {
                System.out.println("Today is Tuesday");
            }
            case 3 -> {
                System.out.println("Today is Wednesday");
            }
            case 4 -> {
                System.out.println("Today is Thursday");
            }
            case 5 -> {
                System.out.println("Today is Friday");
            }
            case 6 -> {
                System.out.println("Today is Saturday");
            }
            case 7 -> {
                System.out.println("Today is Sunday");
            }
            default -> {
                System.out.println("Wrong input!");
            }
        }

        switch (weekDay){
            case 1, 2, 3, 4, 5 ->{
                System.out.println("This is working day");
            }
            case 6, 7 -> {
                System.out.println("This is weekend");
            }
            default -> System.out.println("Wrong input!");
        }
    } // end of main
} // end of class
