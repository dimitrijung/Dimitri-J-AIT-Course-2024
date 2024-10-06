package homework_08;

// Задача 4.
// В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
// Каждый тип билета имеет свою стоимость.
// Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
// Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места, а возвращает итоговую стоимость билета.
// Реализуйте приложение-бот, которое задает необходимые вопросы и объявляет стоимость билета.

import java.util.Scanner;

public class KinoTicketPrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your age ?: ");
        int age = scanner.nextInt();

        System.out.println("Student Y/N ?: ");
        String student = scanner.next();

        System.out.println("VIP Y/N ?: ");
        String vip = scanner.next();

        double price = ticketPrice (age, student, vip);
        System.out.println("To pay: "+ price);

        }// end of main

        private static double ticketPrice (int age, String student, String vip) { // этим методом я просчитиваю цену билета согласно тому, что ввел пользователь через клавиатуру. Age, Student, Vip
             double normalPrice = 10; // Декларирую переменную normalPrice и вкладываю в нее стандартную цену билета 10€ для дальнейших операций.
            if (age > 65) { // если пользователь старше 65 то он пенсионер и согласно условию задачи он получает 25% скидку. Скидку просчитываю в следующей строке.
                normalPrice = normalPrice * 0.75; // просчитываю скидку
            }if (student.equals("Y")) { // здесь я сравниваю с помощью .equals (проверяет имеют ли два обьекта одинаковое значение)  ответ пользователя на вопрос "Student Y/N ?:", если он нажал Y то выполняю просчет стоимости билета согласно условию задачи с 10% скидки.
             normalPrice = normalPrice * 0.90;  // просчитываю скидку
            }if (vip.equals("Y")){ // // здесь я сравниваю с помощью .equals (проверяет имеют ли два обьекта одинаковое значение)  ответ пользователя на вопрос "VIP Y/N ?:", если он нажал Y то выполняю просчет стоимости билета согласно условию задачи с 25% надбавки.
                normalPrice = normalPrice * 1.25; // просчитываю скидку
            }
            return normalPrice;
        }

}// end of class
