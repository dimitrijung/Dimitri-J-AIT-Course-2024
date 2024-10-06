package classwork_10;

// Задача 4.
//        Создайте массив, который содержит возраст студентов группы.
//        - какой возраст максимальный?
//        - какой возраст минимальный?

public class MinMaxAge {

    public static void main(String[] args) {

    int[] age = {47,49,37,44,34,38,18,38,35,41,18,43};

    int min = age[0];

        for (int i = 0; i < age.length; i++) {
            if (age[i]<min){
                min = age[i];
            }
        }
        System.out.println("Min age = " + min);

    } // end of main
} // end of class
