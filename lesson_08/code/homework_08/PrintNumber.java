package homework_08;

// Задача 2.
// Распечатайте все натуральные числа меньшие 200 и кратные 13.
// Используйте циклы while и do while.

public class PrintNumber {

    public static void main(String[] args) {

        int count = 0;


   while (count < 201){
       if (count % 13 == 0){
           System.out.println(count);
       }
       count = count +1;
   }


    }
}
