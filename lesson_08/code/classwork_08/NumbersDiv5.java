package classwork_08;

// Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class NumbersDiv5 {

    public static void main(String[] args) {

        int i = 1; // параметр цикла
        int end = 101;

        while (i < end){
            if (i % 5 == 0 ){ // условие (i % 5 == 0) нам говорит любое число которое делется на 5  и имеет осток 0 должно быть напичатано в строке System.out.println (ниже в коде)
                System.out.print(i +" " );
            }
            i = i + 1; // увеличиваем переменную i на +1

        }
    } // end of main
} // end of class
