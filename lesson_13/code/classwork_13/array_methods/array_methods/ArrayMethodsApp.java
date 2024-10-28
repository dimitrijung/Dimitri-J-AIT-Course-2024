package classwork_13.array_methods.array_methods;


public class ArrayMethodsApp {

    public static void main(String[] args) {

       // int[] myArray = ArrayMethods.fillArray(10,20,30); //вызываем метод который лежит в ArrayMethods под названием fillArray.

        //ArrayMethods.printArray(myArray);

        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Input your number for searching:");
        //int n = scanner.nextInt();

        //boolean isInArray = ArrayMethods.searchInArray(myArray, n);
        //System.out.println("Number " + n + " is in Array: " + isInArray);


        int[] myArray ={50, 40, 30, 20, 10};
     //   System.out.println(ArrayMethods.linearSearch(myArray, 10));
     //   System.out.println(ArrayMethods.linearSearch(myArray, 100));

        System.out.println("------------------------------------------");

        int index = ArrayMethods.binarySearch(myArray,10);
        System.out.println(index);

    }// end of main

}// end of class
