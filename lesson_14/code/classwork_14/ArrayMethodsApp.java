package classwork_14;



public class ArrayMethodsApp {

    public static void main(String[] args) {

        // create array with random numbers
        //int[] myArray = ArrayMethods.fillArray(0,100,10);


        // print array
        //ArrayMethods.printArray(myArray);


        // sort array
        //ArrayMethods.bubbleSort(myArray);

        // print sorted array
        //ArrayMethods.printArray(myArray);


        int[] newArray = ArrayMethods.fillArray(1,20,6);

        ArrayMethods.printArray(newArray);

        ArrayMethods.reverseArray(newArray);

        ArrayMethods.printArray(newArray);










       // int[] myArray = ArrayMethods.fillArray(10,20,30); //вызываем метод который лежит в ArrayMethods под названием fillArray.

       // ArrayMethods.printArray(myArray);

       // Scanner scanner = new Scanner(System.in);
       // System.out.println("Input your number for searching:");
       // int n = scanner.nextInt();

       // boolean isInArray = ArrayMethods.searchInArray(myArray, n);
       // System.out.println("Number " + n + " is in Array: " + isInArray);


       // int[] myArray ={50, 40, 30, 20, 10};
       // System.out.println(ArrayMethods.linearSearch(myArray, 10));
       // System.out.println(ArrayMethods.linearSearch(myArray, 100));

       // System.out.println("------------------------------------------");

       // int index = ArrayMethods.binarySearch(myArray,10);
       // System.out.println(index);

    }// end of main

}// end of class
