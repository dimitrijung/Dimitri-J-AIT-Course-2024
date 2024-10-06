package classwork_07.cycles;

// Возведите 3 в степень 10, выведите на печать все промежуточные результаты.

public class Power {

    public static void main(String[] args) {

        int pow = (int) Math.pow(3, 10);
        System.out.println(pow);

        // задаем начальные значения

        int count = 0; // параметр цыкла
        int res = 1;

        while ( count < 10){
            res = res * 3; // возведение 3 в степень
            count = count +1; // изменение параметра
            System.out.println(res + "= 3 in power " + count);
        }

    } // end of main
} // end of class
