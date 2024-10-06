package classwork_07.cycles;

// Пользователь вводит натуральное число (целое, положительное).
// Выясните, сколько цифр в числе.

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        // продолжим в цикле деление '/' на 10 пока результат больше 0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();
        int number1 = number;

        int count = 0;

        while (number > 0){        // Логика цикла (number > 0) работай и дели number на 10 до тех пор, пока number больше чем 0

            number = number / 10; // number - это параметр цикла // number делим на 10 до тех пор, пока number не будет меньше чем 0. Затем наш while (number > 0) будет FALSE так как number меньше 0 и цикл прекратится.
            System.out.println(number); // показывам/ выводим результат первого деления на 10 в консоли.
            count = count +1; // эта операция считает сколько раз цикл провел деление на 10. Сколько операций деления было возможно до того как мы получиле 0, столько цифр в заданом через Scanner числе.

        }
        System.out.println("Digits in number " + number1 + " are = " + count);

    } // end of main
} // end of class
