package classwork_03;

// - Задать целочисленные переменные x и y, выполнить c ними математические действия, напечатать результаты вместе с текстовыми пояснениями:
// - какие переменные участвовали;
// - какие действия с ними выполнялись;
// - что получилось в результате.



public class MatchOperation {

    public static void main(String[] args) {

        int x = 38;
        int y = 63;

        System.out.println(x + y);

        int res  = x + y;

        System.out.println("x = " + x + " addieren mit y = " + y + " Ergebnis " + res);

        res = x - y;

        System.out.println("x = " + x + " abstrahieren mit y = " + y + " Ergebnis " + res);

        // dividieren / bekomme gerade Zahl

        res = y / x;
        System.out.println("y = " + y + " / " + " x = " + x + " = " + res);

        // dividieren % bekomme den Rest vom Dividieren

        res = y % x;
        System.out.println("y = " + y + " % " + " x = " + x + " = " + res);




    } // end of main


} //end of class
