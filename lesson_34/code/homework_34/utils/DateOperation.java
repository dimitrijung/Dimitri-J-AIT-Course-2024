package homework_34.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateOperation {

//  Этот метод принимает дату рождения в виде стринга,
//  и возвращающий возраст.

        public static int getAge (String birthDate){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[dd/MM/yyyy][yyyy-MM-dd]");
            LocalDate birthDay = LocalDate.parse(birthDate, formatter);
            LocalDate currentDate = LocalDate.now();
            return Period.between(birthDay, currentDate).getYears();
        }

    public static String[] sortStringDates(String[] dates) {
        // TODO Homework
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy][yyyy-dd-MM][yyyy-dd-MM]");


        return null;
    }

}// end of class
