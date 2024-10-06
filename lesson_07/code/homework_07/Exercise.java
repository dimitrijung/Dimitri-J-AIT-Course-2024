package homework_07;

// Задача 3.
// В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег на 10 % от предыдущего значения.
// Определите номер того дня, на который пробег спортсмена составит не менее target километров.
// Программа получает на вход действительные числа s и target и должна вывести одно натуральное число.

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your distance: ");

        double distance = scanner.nextDouble(); // переменная distance хранит в себе число (растояние) которое задал пользователь.

        //Scanner scanner2 = new Scanner(System.in);
        System.out.println("What distance do you want to reach?: ");

        int goal = scanner.nextInt(); // переменная goal хранит в себе число (цель) которое задал пользователь.

        int day = 1; // переменная, хранит в себе первый день тренировки. В дальнейшем будет увеличиватся до тех пор пока условия цыкла не выполнятся.

        while ( distance < goal){ // Цыкл, работает пока условие (distance < goal) не выполнено. Как только дистанция будет больше цели, цыкл прерывается.
            distance = distance + (distance * 0.1); // увеличиваем дистанцыю на 10% в день.
            day = day + 1; // переходим в следующий день.
        }
        System.out.println("To reach distance of "+ goal + "km you need " + day + " days of training!");

    } // end of main
} // end of class
