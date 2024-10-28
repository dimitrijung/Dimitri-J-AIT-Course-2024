package homework_20;

// Разработайте приложение, которое принимает от пользователя строку (некое предложение, например: "Мама мыла раму.") и выводит:
//   - количество символов в строке;
//   - количество символов в верхнем регистре;
//   - количество цифр в строке;
//   - количество пробелов в строке;
// В зависимости от последнего символа в строке сообщает, какое это предложение:
//   - повествовательное;
//   - вопросительное;
//   - восклицательное.
// Используйте методы класса Character.

import java.util.Scanner;

public class NumberOfSymbol {

    public static void main(String[] args) {
// -----------Инециализация сканнера для ввода предложения-----------
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String sentence = scanner.nextLine(); // сохраняем введенное предложение в переменную sentence

        int numberOfSymbol = sentence.length();

//---------создаем переменные для хранения количества посчитаних символов--------
        int numberOfUpperCase = 0;
        int numberOfDigits = 0;
        int numberOfSpaces = 0;

//----------------цикл для подсчета символов--------------------
        for (int i = 0; i < sentence.length(); i++) {
            char symbol = sentence.charAt(i); // charAt(i) это метод который возвращает нам символ строки на указаной позиции i.

            if (Character.isUpperCase(symbol)) {            // проверка большой буквы
                numberOfUpperCase = numberOfUpperCase + 1;
            } if (Character.isDigit(symbol)){              // проверка символ является цифрой или нет
                numberOfDigits = numberOfDigits + 1;
            } if (Character.isSpaceChar(symbol)){          // проверка является символ пробелом
                numberOfSpaces = numberOfSpaces + 1;
            }
        }// end of for

        System.out.println("Number of Symbols: " + numberOfSymbol);
        System.out.println("Upper Cases: " + numberOfUpperCase);
        System.out.println("Digits: " + numberOfDigits);
        System.out.println("Spaces: " + numberOfSpaces);

        char lastChar = sentence.charAt(sentence.length()-1); // берем последний сивол в предложение sentence.
        if (lastChar == '.'){                                 // сравниваем являиться послений символ '.'
            System.out.println("Narrative sentence");
        } else if (lastChar=='?') {                           // сравниваем являиться послений символ '?'
            System.out.println("Interrogative sentence");
        } else if (lastChar=='!') {                           // сравниваем являиться послений символ '!'
            System.out.println("Exclamation sentence");
        }


    }// end of main
}// end of class
