package classwork_04;

public class Exercise1 {

    public static void main(String[] args) {

// exchange USD/EUR
    double money = 500; // USD
    double rate = 0.9;
    double euro = exchangeUSDtoEUR(money, rate);
        System.out.println("Euro: " + euro);

// Calories
    double weight = 100; // gramm
    double colorage = 200; // colories on 100 gramm
    double energy = calculateCalorie(weight, colorage);
        System.out.println("Colories = " + energy);

    } // end of main

    private static double exchangeUSDtoEUR(double money, double rate ){
        //double rate = 0.9;
        return money * rate;
    }

    private static double calculateCalorie(double weight, double colorage){

        return weight * colorage / 100;
    }

} // end of class
