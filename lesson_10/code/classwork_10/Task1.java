package classwork_10;

// Задача 1.
// Создайте массив и заполните его целыми числами от 1 до 20.

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int[20]; // length = 20, indexes from 0 till 19.

        // numbers[0]- 1st element of array(масив).
        // numbers.length = 20.
        // numbers[numbers.length -1]

        //fill in array numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.print(numbers[i] + " ");
        }


    } // end of main
} // end of class
