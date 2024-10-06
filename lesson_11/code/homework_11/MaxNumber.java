package homework_11;

// Задан массив целых чисел: 65, 37, 51, -17, 73, -41, 52, 56, -55, 83.
// Найдите максимальный элемент массива и его индекс.
// Поставьте этот элемент в начало массива вместо имеющегося.
public class MaxNumber {

    public static void main(String[] args) {

    int[] numbers = {65, 37, 51, 99, -17, 73, -41, 52, 56, -55, 83};

    int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[0]) {
                max = numbers[i];
            }
        }

        System.out.println("Max of array = " + max);
        System.out.println();

        numbers[0] = max;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i< numbers.length-1){    // чтоб поставить запитую после каждого числа НО НЕ ПОСЛЕ ПОСЛЕДНЕГО, используем if с условием в скобках.
                System.out.print(", ");
            }//end of if
        }//end of for


    }//end of main
}//end of class
