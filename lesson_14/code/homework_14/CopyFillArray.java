package homework_14;

// 1.Создать массив целых чисел от 1 до 100.
// 2.Создать новый массив, который будет больше на один элемент.
// 3.Скопировать первый массив во второй
// 4.Добавить случайное число от 1 до 100 в случайное место во втором массиве

import java.util.Random;

public class CopyFillArray {
    public static void main(String[] args) {

//----- 1. Создаем массив целых чисел от 1 до 100.------
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i]=i + 1;
            System.out.print(array1[i] + " ");
        }
        System.out.println("---First array---");

//------2. Создаем новый массив, который будет больше на один элемент.------
        int[] array2 = new int[array1.length +1];
        for (int i = 0; i < array2.length; i++) {
           array2[i]= i+1;
            System.out.print(array2[i] + " ");
        }
        System.out.println("---Second Array with +1 Element---");

//------3. Копируем первый массив во второй и для контроля выводим на экран.-----
        for (int i = 0; i < array1.length; i++) {
            array2[i]=array1[i];
            System.out.print(array2[i] +" ");
        }
        System.out.println("---Copied first array into second array---");

//------4. Добавляем случайное число 1 до 100 в случайное место во втором массиве.----
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;  // Генерируем случайное число от 1 до 100.
        int randomPosition = random.nextInt(array2.length); // Генерируем случайную позицую для нашего случайного числа в диапазоне длинны второго масива (array2.length)
        for (int i = array2.length-1; i > randomPosition ; i--) { // Сдвигаем элементы масива в право начиная с конца масива (int i = array2.length-1) до randomPosition (i > randomPosition)
            array2[i] = array2[i-1]; // Присваеваем элемету значение предыдущего элемента тем самым тем самым сдвигаем елемент в право на пустоем место в array2
        }

        array2[randomPosition] = randomNumber; // Когда все элементы с права от randomPosition сдвинуты в право и у нас свободное место, ставим туда randomNumber.
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("---Random number placed on Random position--- ");

    }//end of main
}// end of class

