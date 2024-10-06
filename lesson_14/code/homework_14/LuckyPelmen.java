package homework_14;

// Задача про поиск “счастливого пельменя“.
// Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
// Напишите программу, которая ищет счастливый пельмень.

import classwork_14.ArrayMethods;

import java.util.Random;

public class LuckyPelmen {
    public static void main(String[] args) {

//------Создаем массив из 30 пельменей-----
        int [] pelmeni = ArrayMethods.fillArray(20,30,30); // Создаем массив из 30 пельменей весом от 20 до 30 грамм.
        ArrayMethods.printArray(pelmeni); // Вызываем метод который выводит на экран наши 30 пельменей

//------Создаем счастливый пельмень-----
        Random random = new Random();
        int randomPosition = random.nextInt(pelmeni.length); // Опредиляем случайную позицую в дипазоне нашего массива pelmeni.length для  счастливого пельменя.
        pelmeni[randomPosition] = pelmeni[randomPosition] +15; // Прибавляем 15 грамм к нашему случайно вызначеному пельменю.
        System.out.println("Вес счастливого пельменя: " + pelmeni [randomPosition]);
        System.out.println();
        ArrayMethods.printArray(pelmeni); // Вызываем метод который выводит на экран наши 30 пельменей вместе со счастливым.

//------Поиск пельменя с помощью линейного сравнения-----
        ArrayMethods.linearSearch(pelmeni,  pelmeni[randomPosition]);

//------Выводим на экран номер счастливого пельменя-----
        System.out.println("Cчастливый пельмень под номером: " + (ArrayMethods.linearSearch(pelmeni,  pelmeni[randomPosition]) +1)); // так как идекс первого пельменя в программе 0 мы прибавляем +1 чтоб расчет шел с первого пельменя, а не с нулевого.












    }// end of main
}// end of class
