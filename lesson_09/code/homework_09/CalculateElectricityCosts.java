package homework_09;

// Задача 3. 
// Анна использует различные электроприборы в своем доме. У неё есть холодильник, который потребляет 150 Вт, и кондиционер с потреблением 2000 Вт. 
// Анна хочет узнать, сколько она тратит на электроэнергию в месяц, если стоимость 1 кВт·ч составляет 0.15 евро. 
// Вопросы: Сколько электроэнергии тратят холодильник и кондиционер вместе в час? (calculateHourlyConsumption) 
// Сколько Анна тратит на электроэнергию в месяц? (calculateMonthlyCost)


public class CalculateElectricityCosts {

    public static void main(String[] args) {
        
        
        double fridge = 150; // переменная со значением потребления електричества в размере 150 Вт в моменте. За сутки он употребляет 150 * 24 = 3600Втч или 3,6КВтч.
        double air = 2000; // переменная со значением потребления електричества в размере 2000 Вт в моменте.За сутки: 2000 Вт * 24 = 48000Втч или 48КВтч.
        double kWh = 0.15; // переменная со стоимостью КВт-часса в размере 0.15€.

        double costsMonthly = calculateMonthlyCost (fridge, air, kWh);
        System.out.println(" Monthly costs: " + costsMonthly + " €");

        double electricityHourly = calculateHourlyConsumption(fridge, air);
        System.out.println(" Both devises consume: " + electricityHourly + " Watt " );
        
        
    } // end of main

    private static double calculateMonthlyCost (double fridge, double air, double kWh ){
        double res = ((fridge + air) * 24) * 30; // сумму Вт двух приборов я умножаю на 24 часса  и умножаю на 30 дней чтоб получить расход холодильни и кондиционера в месяц.
        return (res / 1000) * 0.15; // я делю res на 1000 чтобы полученый результат 1 548 000 Втч перевести в 1548КВтч и умнажаю на стоимоть одного КВт часса в размере 0.15€.
    }

    private static double calculateHourlyConsumption (double fridge, double air){
        double res = fridge + air;
        return res;
    }

} // end of class
