package homework_22;



import java.util.Random;


public class Array100 {
    public static void main(String[] args) {




    int[] array = new int[100];
    Random random = new Random();

    int positiveCount = 0;
    int negativeCount = 0;
    int evenCount = 0;
    int zeroCount = 0;

    // Генерация массива и подсчет категорий
    for(int i = 0; i<array.length;i++) {

        array[i] = random.nextInt(21) - 10; // Числа от -10 до 10

        if (array[i] > 0) {
            positiveCount++;
        } else if (array[i] < 0) {
            negativeCount++;
        }

        if (array[i] == 0) {
            zeroCount++;
        }

        if (array[i] % 2 == 0) {
            evenCount++;
        }
    }

    // Вывод результатов
            System.out.println("Положительных чисел: "+positiveCount);
            System.out.println("Отрицательных чисел: "+negativeCount);
            System.out.println("Четных чисел: "+evenCount);
            System.out.println("Нулей: "+zeroCount);
}
}

