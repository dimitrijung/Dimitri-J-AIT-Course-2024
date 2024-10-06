package classwork_10;

// Создайте массив и заполните его символами латинского алфавита от A до Z.
// Раcпечатайте полученный массив.

public class Alphabet {

    public static void main(String[] args) {

    char[] alphabet = new char[26]; // 26 потому что 26 букв в алфавите.
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (65 + i); // 65 это код буквы А из даблицы ASCII. 65+1=66 и это равно буква В и так далие. (char) (65 + i) говорит нам тип "int" (потому что int это тип для цифр 65+i) переведи нам в формат "char". Потому что мы работаем в данный момент с буквами а "int" это тип дл цифр.
            System.out.print(alphabet[i] + " ");
        }

    } // end of main
} // end of class
