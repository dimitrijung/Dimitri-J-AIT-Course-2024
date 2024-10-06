package homework_07;

// Задача 1.
// Программа получает на вход строку и число повторений этой строки.
// Программа должна вывести эту строку нужное количество раз.
// Пример: строка - молоко, кол-во раз 3
// молоко молоко молоко

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word: ");
        String word = scanner.nextLine();  // String (scanner.nextLine) - тип данных который позволяет принимать и хранять (с помощью Scanner) в переменную (в нашем случае Word) слова заданое пользователем через клавиатуру.

        //Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number of repetitions: ");
        int number = scanner.nextInt();  // переменная number сохраняет в себе число, заданое пользователем через клавиатуру.

        int count = 0;

        System.out.println("---Here is the desired result---");

        while (count < number){
            System.out.println(word);
            count = count +1;
        }

    } // end of main
} // end of class
