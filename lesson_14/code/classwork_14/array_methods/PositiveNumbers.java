package classwork_14.array_methods;

// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Реализуйте метод, который получает на вход исходный массив и возвращает массив,
// содержащий только положительные числа из исходного массива.


import classwork_14.ArrayMethods;

public class PositiveNumbers {
    public static void main(String[] args) {

        int [] numbers = new int[20];
        numbers = ArrayMethods.fillArray(-100,100,20);
        ArrayMethods.printArray(numbers);
        int positive = countPositiveNumbers(numbers);
        System.out.println("Positive numbers in array: " + positive);


    }// end of main

    public static int countPositiveNumbers(int[]array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>0) {
                ;
                count++;
            }// end of if
        }// end of for
        return count;
    }// end of Method countPositiveNumbers

}// end of class
