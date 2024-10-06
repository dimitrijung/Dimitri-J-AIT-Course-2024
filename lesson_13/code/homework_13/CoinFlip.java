package homework_13;

// Подбросьте монетку 100 раз и подсчитайте, сколько раз выпал орел и сколько решка.
// Запишите результаты в массив. Рассчитайте вероятность выпадения орла и решки.

import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {

        Random random = new Random();

        int[] coinFlip = new int[100]; // создаем массив coinFlip который содержит 100 элементов (нашых бросков)

        int orelCounts = 0;   // переменная для хранения выпавших "Орёл"
        int reshkaCounts = 0; // переменная для хранения выпавших "Решка"



        for (int i = 0; i < 100; i++) {           // цикл симулирует подбрасывание монеты. Цикл запускается и повторяется до тех пор пока "i" меньше 100.
            int flip = random.nextInt(2);  // создаем переменную flip, в которую записывается число 1 или 0, результат подбрасывания монеты. Число генерирует random.nextInt.
            coinFlip[i] = flip;                   // каждый результат подбрасывания сохраняем в массив coinFlip, получаем 100 сахранённых результатов. выдаем на экран в строке 23 и круг пошел заново.
            System.out.print(flip + " ");         // результат выдаем на экран.

        if (flip == 1) {                          // если бросок равен 1 то счетчик и orelCounts увеличивается на 1.
            orelCounts = orelCounts + 1;
        } else {                                  // если бросок не равен 1 то счетчик и куырлфCounts увеличивается на 1.
            reshkaCounts = reshkaCounts + 1;
        }// end of else
    }// end of for                                // после завершения 100 подбрасываний цикл останавливается

        double orelChance = (double) orelCounts / 100;       // после того как 100 бросков выполнены, подсчитываем вероятность выпадения Орел
        double reshkaProbably = (double) reshkaCounts / 100;


        System.out.println();
        System.out.print("----------------------------------------------------------");
        System.out.println();
        System.out.println("Orel:" + orelCounts + " times");
        System.out.println("Reshka:" + reshkaCounts + " times");
        System.out.print("----------------------------------------------------------");
        System.out.println();
        System.out.println("Reshka chances:" + reshkaProbably + " %");
        System.out.println("Reshka chances:" + orelChance + " %");



    }//end of main
}//end of class
