package classwork_12;

// Смоделируйте бросок игрального кубика 20 раз.
// Подсчитайте, сколько раз выпала каждая грань?
// Проверьте, равны ли вероятности выпадений граней кубика

import java.util.Random;

public class Dice {

    public static void main(String[] args) {

        Random random = new Random();

        int[] toss = new int[20];

    //  ---------------------------------------------FILL IN
        for (int i = 0; i < toss.length; i++) {
            //вызов датчика случайных чисел
            int n = random.nextInt(6) +1; // диапазон от 0 до 5(включена) +1 чтобы сдвинуть 0 на 1 а 5 на 6.
            toss[i]=n;                           // мы занесли результаты генератора чисел в массив toss и сохранили их там
            System.out.print(n + " ");
        }// end of for
        System.out.println();

        //calculate results of tossing
        int[] res = new int[6]; // array for results
        for (int i = 0; i < toss.length; i++) {
            int k = toss[i];
            switch (k){
                case 1->res[0]++;
                case 2->res[1]++;
                case 3->res[2]++;
                case 4->res[3]++;
                case 5->res[4]++;
                case 6->res[5]++;
            }
        }
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }//end of main
}//end of class


//-------------- result Anastasia----------------
//int sum = 0;

//for (int j = 1; j <= 6; j++)
//        {
//        for (int i = 0; i < toss.length-1; i++)
//        {
//        if (toss[i] == j) sum ++;
//        }
//        System.out.println(j + " = " + sum);
//sum = 0;
//        }