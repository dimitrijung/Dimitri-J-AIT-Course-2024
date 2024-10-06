package classwork_13.array_methods.array_methods;

//  - заполнение массива случайными целыми числами из интервала от a до b
//  - печать массива целых чисел
//  - поиск элемента

public class ArrayMethods {

    // O(log(n))
    // binary search

    public static int binarySearch(int[] array, int n){
        int leftIndex = 0;
        int rightIndex = array.length -1;

        while (leftIndex <= rightIndex){
            int midIndex = (leftIndex + rightIndex) / 2;
            if (array[midIndex] == n){
                return midIndex;
            } else if (n > array[midIndex]) {
                rightIndex = midIndex -1; // правую половину надо отбросить
            } else {
                leftIndex = midIndex +1; // левую половину надо отбросить
            }// end of last else
        }// end of while
       return  -leftIndex -1; // если элемент не нашёлся
    }// end of Method binarySearch

// ---------------------------------------------------------------------------

    // linear search, return index (if element absent return -1)
    public static int linearSearch(int[] array, int n){
        for (int i = 0; i < array.length; i++){
            if (array[i] == n){
                return i;
            }// end of if
        }// end of for
        return -1;
    }// end of Method linearSearch




//===========================================================

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
        for (int i = 0; i < array.length; i++) {
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