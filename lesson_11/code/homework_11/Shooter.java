package homework_11;

// У стрелка есть 10 попыток поразить мишень.
// Смоделируйте 10 выстрелов с помощью датчика случайных чисел.
// Ответьте на вопрос, сколько очков набрал стрелок? Попал ли он хоть раз в центр мишени?

import java.util.Random;

public class Shooter {
    public static void main(String[] args) {

    Random random = new Random();
        
    int[] shoots = new int[10]; //обьявил массив для результатов

    // FILL IN
    for (int i = 0; i < shoots.length; i++) {
        //вызываю генератор случайных чисел
        int shoot = random.nextInt(6); // генератор иметирует наши 10 выстрелов
        shoots[i] = shoot; // наши 10 выстрелов мы сахраняем в массив Shoots[i] для дальнейшей работы
        System.out.print(shoots[i] + " ");
    }
    //подсчитываем сколько очков набрал стрелок
    int sumShoot = 0; //переменная sumShoot хранит в себе промежуточный ответ сумирования очков из строки 26.
    for (int i = 0; i < shoots.length; i++) {
        sumShoot = sumShoot + shoots[i];
    }
    System.out.println();
    System.out.println(sumShoot);

        //вычесляем попал ли стрелок хоть раз в цель 5. Если да то выводим текст "Target hit"
        for (int i = 0; i < shoots.length; i++) {
            if (shoots[i]==5){ // если число из массива равно 5 то выдай текст из строки 33.
                System.out.println("Target hit!");
                return;
            }
        }
        System.out.println("Target missed!");// по истечению цикла, если пятерки не выходит то стрелок не попал и мы получаем "Target missed"

    }//end of main
}//end of class
