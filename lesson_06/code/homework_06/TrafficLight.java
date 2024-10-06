package homework_06;

// Задание 3.
// Напишите программу для машины на светофоре.
// Что делать водителю, если горит красный, жёлтый или зелёный свет.
// Цвет светофора задается в программе с клавиатуры.


import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // вызываем сканер для ввода числа через клавиатуру
        System.out.println("Enter a number (1-RED, 2-YELLOW, 3-GREEN): "); // информационная строка высвечивается на экране
        int number = scanner.nextInt();  // переменная куда сканнер вложит заданую цыфру

        switch (number){  // оператор SWITCH используется для выбора одной из альтернатив 1 или 2 или 3 или 4
            case 1->{
                System.out.println("Traffic light is RED. Please stand still.");
            }
            case 2->{
                System.out.println("Traffic light is YELLOW.Pleas slow down.");
            }
            case 3->{
                System.out.println("Traffic light is GREEN. You can drive.");
            }
            default -> {
                System.out.println("Your enter is wrong. Please try again.");
            }
        }
    } // end of main
} //end of class
