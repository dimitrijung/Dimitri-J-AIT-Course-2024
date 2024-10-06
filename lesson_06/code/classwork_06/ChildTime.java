package classwork_06;

// **Задание 3.**
// Родители позволяют ребенку играть на компьютере 1 час.
// Напишите программу, которая будет реагировать на полученную в школе оценку:
// 1. "Молодец!", время для игр на компьютере увеличивается на 30 мин.
// 2. "Хорошо", ты можешь играть на компьютере обычные 60 минут.
// 3. "Посредственно.", время для игр уменьшается на 30 мин.
// 4. "Плохо!", сегодня никаких игр на компьютере.
// 5. "Позор семьи!", никаких игр на компьютере 2 дня

import java.util.Scanner;

public class ChildTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Which mark have you got today? (1, 2, 3, 4, 5)");
        int mark = scanner.nextInt(); // переменная куда сканнер вложит оценку ребенка

        int timeForGame = 60;
        // переключатель
        switch (mark){
            case 1 :{
            System.out.println("Молодец!");
            timeForGame = timeForGame + 30;
            System.out.println( "Время для игр на компьютере:" + timeForGame);
            break;
        }
            case 2 :{
                System.out.println("Хорошо!");
                System.out.println( "Время для игр на компьютере:" + timeForGame);
                break;
            }
            case 3 : {
                System.out.println("Посредственно!");
                timeForGame = timeForGame - 30;
                System.out.println("Время для игр на компьютере: " + timeForGame);
                break;
            }
            case 4 : {
                System.out.println("Плохо! ");
                timeForGame = timeForGame = 0;
                System.out.println("Сегодня никаких игр на компьютере " );
                break;
            }
            case 5 : {
                System.out.println("Позор семьи! ");
                timeForGame = timeForGame -120;
                System.out.println("Никаких игр на компьютере 2 дня " );
                break;
            }
            default: {
                System.out.println("Wrong input! ");
            }
        }
    } // end of main
} // end of class
