package classwork_12.array_methods;

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
//  - поиск элемента

public class ArrayMethods {

//------------Fill Array with random numbers-------------

    // a-left border, b-right border, n-quantity
    public static int[] fillArray(int a, int b, int n){
        int[] res = new int[n];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int)(Math.random()*(b-a+1)+a);
        }// end of for
        return res;
    }// end of Method fillArray


//---------------------Print Array-----------------------

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+ " ");
        }// end of for
        System.out.println();
        System.out.println("-----------------------------");
    }// end of Method printArray


//--------------------Search in Array----------------------

    public static boolean searchInArray(int[]array, int n){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n){
                return true;
            }// end of if
        }// end of for
        return false;
    }// end of Method searchInArray






}// end of class
