package homework_10;

// Создайте массив из 20 случайных(*) целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {

        Random random = new Random(); // здесь я создаю инструмент который будет давать рандомные числа
        int[] number = new int[20]; // массив который хранит 20 целых чисел. Ему я дал имя a


        for (int i = 0; i < number.length; i++) { // этот цикл повторяется 20 раз, пока i меньше чем длинна массива в 20 элементов.
            number[i] = random.nextInt(21) + 10; // функция nextInt(21) генерирует число от 0 до 20. Так как в условие от числа от 10 до 30 брибавляем еще +10. И теперь когда генерируется допустим 2, автоматом прибавляется +10 и мы получаем число 12.
            System.out.print(number[i] + " "); // выводим число из строки 18 в консоль. Повторяем цикл 20 раз.
        }
        System.out.println(); // дальнейший вывод с новой строки

        // МЕНЯЕМ ПЕРВЫЙ И ПОСЛЕДНИЙ ЭЛЕМЕНТЫ
        int temp = number[0]; // создаю временную переменную под именем temp и сохраняю туда число из первого элемента который стоит на нулевом месте (самое первое число).
        number[0] = number[19]; // первый элемент приравниваю к последнему элементу тем самым говорю что первое число идет на посленее место.
        number[19] = temp; // последний элемент приравниваю к временной переменной в которой хранится первое число (столка 23).
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " "); // вывод на экран
        }

    } // end of main
} // end of class
