package homework_10;

// Собрать в массив данные о дневной температуре в вашем городе за прошедшую неделю.
// Выведите на печать температуру, которая была во вторник и затем в четверг.
// Найти среднюю температуру за прошлую неделю.


public class TemperatureWeek {
    public static void main(String[] args) {

       int [] temp = {32,33,34,36,32,30,31};
       int sumTemp = 0;
        System.out.println("Temperature on Tuesday was: " + temp[1] + "°C");
        System.out.println("Temperature on Thursday was: " + temp[3] + "°C");

        for (int i = 0; i < temp.length; i++) {
            sumTemp = sumTemp + temp[i];
        }
        double avgTemp = (double)sumTemp / temp.length;
        System.out.printf( "Average weekly temperature is: %.2f" + avgTemp + "°C");
    } // end of main
} // end of class
