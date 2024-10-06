package homework_09;

// Задача 4.
// Написать программу-бот, который помогает выбрасывать мусор в баки разных цветов:
//    - упаковки в желтый бак
//    - пищевые отходы в коричневый бак
//    - бумага в зеленый бак
//    - прочие отходы в черный бак
// Используйте цифры для кодирования вариантов действий

import java.util.Scanner;

public class WasteSeparation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // START HERE
        boolean flag = true;

        while (flag) {

            System.out.println("Хотите утилизировать отходы? y/n ");
            char ch = scanner.next().charAt(0); // char  помогает считать строку. charAt (0) считывает только первую букву строки тоесть 0. Если ввести 'yes' то праграмма распознает только букву  'y'
            if (ch == 'y') {

                System.out.println("Выберите: 1-упаковки / 2-пищевые отходы / 3-бумага / 4-прочие отходы ");

                int number = scanner.nextInt();

                switch (number) {
                    case 1 -> {
                        System.out.println("Отходы в желтый бак ");
                    }
                    case 2 -> {
                        System.out.println("Отходы в коричневый бак");
                    }
                    case 3 -> {
                        System.out.println("Отходы в зеленый бак");
                    }
                    case 4 -> {
                        System.out.println("Отходы в черный бак");
                    }
                    default -> {
                        System.out.println("Не правельный ввод! Выберите: 1-упаковки / 2-пищевые отходы / 3-бумага / 4-прочие отходы ");
                    }
                }
            } else {
                flag = false;
            }
        }

    } // end of main
} // end
