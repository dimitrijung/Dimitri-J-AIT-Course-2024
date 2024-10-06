package classwork_08;

// Распечатать в консоли таблицу умножения от 1 до 10.

public class MultiplicationTable {

    public static void main(String[] args) {

    // цикл в цикле

        int i = 1, j = 1;

        while (i < 10){

            while (j < 10){

                System.out.print(i + " * " + j + " = " + (i*j) + "  /  ");
                j = j + 1;

            } // end of while j
            j=1;
            i = i + 1;
            System.out.println(); // next line

        } // end of while i

    } // end of main
} // end of main
