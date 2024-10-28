package homework_33;

// Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()

// Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.
// Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.

public class WeekDaysAppl {
    public static void main(String[] args) {

//--- .values ---
        WeekDay[] days = WeekDay.values();
        System.out.println("--- values of Enum ---");
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i].getNumber() + " - " + days[i].getName());
        }
//--- toString() ---
        System.out.println("--- toString() ---");
        String str = WeekDay.FRI.toString();
        System.out.println(str);

//--- ordinal() ---
        System.out.println("--- ordinal() ---");
        int num = WeekDay.THU.ordinal();
        System.out.println(num);

//--- valueOf() ---
        System.out.println("--- valueOf() ---");
        WeekDay day = WeekDay.valueOf("MON");
        System.out.println(day);

//--- метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели ---
      WeekDay d = WeekDay.FRI;
        System.out.println("Start day - " + d);
        int x = 10;
        d = d.plusDay(x);
        System.out.println("After " + x + " days, it will be " + d);

    }// end of main
}// end of class
