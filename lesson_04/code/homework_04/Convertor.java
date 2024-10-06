package homework_04;

// Напешите метод который переводит градусы Цельсия в Фаренгейт
// Напешите метод который пересчитывает морские мили в километрыю 1 миля = 1852 метра.

public class Convertor {

    public static void main(String[] args) {

// Декларирую переменные Celsius to Fahrenheit
        double C = 20;
        double F = celciusToFahrenheit (C);
            System.out.println("Temperature is: " + F + "°F");

// Декларирую переменные Seemile to Kilometer
        double Sm = 3;
        double Km = convertorSmToKm (Sm);
            System.out.println("Distance is: " + Km + "km");

    } // end of main

//--------------------------------------Методы------------------------------------------

    // Метод проводит перерасчет по заданой формуле (C * 1.8 + 32) и выдает ответ return
    public static double celciusToFahrenheit(double C){
         return C * 1.8 + 32;
    }
    // Метод проводит перерасчет по заданой формуле (Sm * 1.852) и выдает ответ return
    private static double convertorSmToKm (double Sm){
        return Sm * 1.852;
    }

} // end of class
