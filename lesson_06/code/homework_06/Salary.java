package homework_06;

// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
//  - За 3 года работы надбавка 10%,
//  - за 5 лет работы надбавка 50%,
//  - за 10 лет работы надбавка 100%,
//  - за 15 лет работы надбавка 150%.
// Сколько лет проработал работник вводится с клавиатуры.

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // вызываем сканер для ввода числа через клавиатуру
        System.out.println("How many years are you working?: ");  // информационная строка высвечивается на экране
        double years = scanner.nextDouble(); // переменная куда сканнер вложит заданую цыфру

        int salary = 500; // переменная SALARY которой мы присвоили значение 500

        if (years > 0 && years < 3){ // человек ввел количество лет сколько он работаеб, если меньше 3 то нет надбавки
            salary = salary;
            System.out.println("Надбавка 0%. Не достаточный опыт работы!");
        } else if (years >= 3 && years < 5){
            salary = salary + 50;
            System.out.println("Надбавка 10%. Итоговый оклад:" + salary + "$");
        } else if (years >= 5 && years < 10) {
            salary = salary + 250;
            System.out.println("Надбавка 50%. Итоговый оклад:" + salary + "$");
        } else if (years >= 10 && years < 15) {
            salary = salary + 500;
            System.out.println("Надбавка 100%. Итоговый оклад:" + salary + "$");
        } else if (years == 15) {
            salary = salary + 750;
            System.out.println("Надбавка 150%. Итоговый оклад:" + salary + "$");
        } if (years > 15){
            System.out.println("Хватит работать! Наслаждайся жизню!!!");
        }
    } // end of main
} // end of class


