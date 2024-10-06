package homework_04;

// Напешите методы для конвертации валют
// - EUR/ USD
// - EUR/ GBP
// - EUR/ CNY

public class Exchange {

    public static void main(String[] args) {

// Декларирую переменные EUR to USD
    double EUR = 20;
    double rateEUR = 1.11;
    double USD = currencyExchange(EUR, rateEUR);
        System.out.println("If you change: " + EUR + "€ " + "you will get: " + USD + "$");

// Декларирую переменные EUR to GBP
    double rateGBP = 0.84;
    double GBP = currencyExchange(EUR, rateGBP);
        System.out.println("If you change: " + EUR + "€ " + "you will get: " + GBP + "£");

// Декларирую переменные EUR to CNY
    double rateCNY = 7.87;
    double CNY = currencyExchange(EUR, rateCNY);
        System.out.println("If you change: " + EUR + "€ " + "you will get: " + CNY + "¥");

    } // end of main

//--------------------------------------Методы--------------------------------------------

// Метод Converter
    public static double currencyExchange (double EUR, double rate){ // этот метод поочереди работает с каждым из курсов rateUSD/ GBP/ CNY
        return EUR * rate;
    }

// Метод Converter EUR to GBP
    //private static double currencyExchange (double EUR, double rateGBP){
    //return EUR * rateGBP;
    //}

// Метод Converter EUR to CNY
    //private static double currencyExchange (double EUR, double rateCNY) {
    //return EUR * rateCNY;
    //}

} // end of class
