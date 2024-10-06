package classwork_07.cycles;

// Задача 2.
// Запустить обратный отсчет старта ракеты от 10 до 0.
// Последнее сообщение: "Поехали!...".

public class Rocket {

    public static void main(String[] args) {

        // задаем стартовые условия
        int countDown = 10;
        System.out.println("We heve " + countDown + " sec before start!");

        while ( countDown > 0 ){
            countDown = countDown - 1;
            //countDown--; // уменьшает countDown на 1, работает аналогично "countDown = countDown - 1;" только короче, для ленивых
            System.out.println("We have " + countDown + " sec till start!.");
        }
        System.out.println("Here we go!");
    } // end of main
} // end of class
