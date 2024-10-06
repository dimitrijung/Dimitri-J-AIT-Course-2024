package Homework_05;

public class Minimum {

    public static void main(String[] args) {
    // Декларирую переменные
        int a = 13;
        int b = 45;

    // Вызов метода
        int min = minimum(a, b);
        System.out.println("Minimun = " + min);

    } // end of main

    // Метод -> определяет меньшее из двух чисел
    public static int minimum (int a, int b){
        int min;
        if ( a < b ){
            min = a;
        }else {
            min = b;
        }
    return min;
}

} // end of class
