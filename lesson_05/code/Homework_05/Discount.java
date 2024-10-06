package Homework_05;
// Сделайте расчет покупки товаров со скидками.
//      - Товар А стоит 10€  и на него скидка 10%,
//      - Товар B стоит 20€ и на него скидка 20%.
// Клиент взял 5 товаров A и 10 товаров B.
// Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
// Вычислите итоговую стоимость покупки и величину полученной скидки.

public class Discount {

    public static void main(String[] args) {

    int A = 10;
    int A_discounted = 9;
    int A_amount = 5;

    int B = 20;
    int B_discounted = 16;
    int B_amount = 10;

int sum = summery(A_discounted, B_discounted );
        System.out.println("You bouth:" + sum);

    } // end of main
    private static int summery (int A_discounted, int B_discounted) {
    return A_discounted + B_discounted;
    }

} // end of class
