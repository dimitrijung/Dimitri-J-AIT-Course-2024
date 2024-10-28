package homework_33;

//Задать ENUM weekDay - дни недели. Опробовать на нем методы: .values() .toString .ordinal() .valueOf()

// Реализуйте метод, позволяющий прибавлять дни к выбранному дню недели, получая правильный день недели.
// Пример: Monday + 10 days = Thursday (понедельник + 10 дней = четверг) Проверьте работу метода с помощью теста.

public enum WeekDay {
 MON ("Monday",1), TUE("Tuesday",2), WED("Wednesday",3), THU("Thursday",4), FRI("Friday",5), SAT("Saturday",6), SUN("Sunday",7);

    //fields
    private String name;
    private int number;

    WeekDay(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WeekDay{");
        sb.append("name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append('}');
        return sb.toString();
    }

    public WeekDay plusDay (int quantity){
        int number = this.ordinal();
        int index = number + quantity;
        WeekDay[] days = WeekDay.values();
        int res = index % days.length;
        return days[res];
    }

}// end of enum
