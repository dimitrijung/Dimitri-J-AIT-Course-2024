package classwork_05;
// Проверка положительное или отрицательное число.
// Проверка четное или нечетное целое число.
// Проверка возраста. Если пользователю 18 лет и менее, то сообщить "Вам надо
// прийти вместе с вашим опекуном", иначе сообщить "Вам разрешено действовать самостоятельно".


public class Conditions_Ex {

    public static void main(String[] args) {

        //-------------------- не полный условный оператор-------------------
        int x = 158;

        if ( x >= 0 ){
            System.out.println("x = " + x + " is positive number");
        }

        if ( x < 0 ){
            System.out.println("x = " + x + " is negative number");
        }

        //-----------------------полный условный оператор-------------------

        x = -234; // переопределил значение переменной

        if ( x >= 0){
            System.out.println("x = " + x + " is positive number");
        } else{
            System.out.println("x = " + x + " is negative number");
        }

        //-----------------------------------------------------------------
        x = 13;

        if ( x % 2 == 0 ){
            System.out.println("x = " + x + " is even");

        }else {
            System.out.println("x = " + x + " is odd");
        }

        //-----------------------------------------------------------------
        int age = 18;

        if( age >= 18 ){
            System.out.println("Вам разрешено действовать самостоятельно");

        }else{
            System.out.println("Вам надо прийти вместе с вашим опекуномо");
        }






    } // end of main

} // end of class
