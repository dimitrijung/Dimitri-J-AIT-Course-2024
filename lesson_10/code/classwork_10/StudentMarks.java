package classwork_10;

// Имеются оценки абитуриента из его аттестата, всего 20 оценок.
// Найдите средний балл абитуриента.

public class StudentMarks {

    public static void main(String[] args) {

    int[] marks = {1,6,4,3,1,2,3,2,3,4,5,2}; // обьявление массива в явном виде. В фигурных скобках все оценки что получил студент.
    int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }
        System.out.println("Sum = " + sum);

        double avarageMarks = (double) sum / marks.length; // (double) в скобках мы ставим для кастингаю Тем самым говорим кампилятору выдай мне число полное не уризай остаток после запятойб тоесть 2, 75. Без double кампилятор выдаст нам только 2.
        System.out.println("Avarage mark = " + avarageMarks);

    } // end of main
} // end of class
