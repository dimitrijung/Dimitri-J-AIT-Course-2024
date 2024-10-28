package homework_22;

import classwork_14.ArrayMethods;

import java.util.Random;

public class Array {
    public static void main(String[] args) {

        int[] myArray = randomArray ();
        ArrayMethods.printArray(myArray);

        int positiveCount = countPositiveNumbers (myArray);
        System.out.println("\nPositive numbers: " + positiveCount);

        int negativeCont = countNegativeNumbers (myArray);
        System.out.println("Negative numbers: " + negativeCont);

        int evenCount = countEvenNumbers (myArray);
        System.out.println("Even numbers: " + evenCount);

        int zeroCount = countZeros (myArray);
        System.out.println("Zeros: " + zeroCount);

    } // end of main



//-----------Method for create myArray------------
    public static int[] randomArray (){
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i]= random.nextInt(21)-10;
        }
        return array;
    }

//------------Method for count positive Numbers------------
public static int countPositiveNumbers (int[] x){
    int count = 0;
        for (int i = 0; i < x.length; i++) {
        if (x[i] > 0){
            count = count +1;
        }
    }
        return count;
}// end of method countPositiveNumbers

//------------Method for count negative Numbers------------
public static int countNegativeNumbers (int[] array){
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] < 0){
            count = count +1;
        }
    }
    return count;
}// end of method countNegativeNumbers

//-------------Method for count even Numbers----------------
public static int countEvenNumbers (int[] array){
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 == 0){
            count = count +1;
        }
    }
    return count;
}// end of method countEvenNumbers

//----------------Method for count Zeros-------------------
public static int countZeros (int[] array){
    int count = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == 0){
            count = count +1;
        }
    }
    return count;
}// end of method countEvenNumbers


}// end of class
