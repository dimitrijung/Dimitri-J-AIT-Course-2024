package classwork_08;

// Задача 1
// Пользователь вводит с клавиатуры строку.
// Распечатайте каждую букву строки на новой строчке.
// Используйте методы length и charAt() класса String.

import java.util.Scanner;

public class LetterInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string: ");
        String str = scanner.nextLine();

        System.out.println(str);

        int l = str.length();
        System.out.println(l);
        int i = 0;

        // Dimitri
        // 0123456

        while (i < l){
            System.out.println(str.charAt(i)); // вывод в консоль (str.chartA(i)) str.-> слово из сканера chartAt(i)-> вывиди букву под номером i в нашем случае 0 -> D(первая буква в слове Dimitri)
            i = i + 1; // или сокращенно 'i++;'
        }

    } // end of main
} // end of class
