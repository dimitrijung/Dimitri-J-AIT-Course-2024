package homework_13;

// Задача 1
// Написать метод copyOfArray. Метод принимает на вход массив целых чисел и целое число - длину нового массива newLength.
// Метод должен создать новый массив длиной newLength.
// В новый массив должны быть скопированы элементы из входящего массива:
// Пример: Исходный массив: {0, 1, 2, 3, 4 , 5, 6} -> copyOfArray(array, 3) -> вывод на печать {0, 1, 2}

public class CopyMethod {


    public static int[] copyOfArray (int [] array, int n){
        int[] copyArray = new int[n];                       // мы создаем новый массив с длинной [n] и присваиваем эту длинну нашему массиву copyArray.
        for (int i = 0; i< array.length && i < n; i++){     // создаем цыкл и говорим ему условие "i< array.length && i < n" работай до тех пор пока  "i" меньше длинны старого цикла, либо "i" меньше длинны [n] нового цикла.
            copyArray[i] = array[i];                        // пока цикл в работе все элементы из старого масива копируются и приравниваются элементам нового массива.
            System.out.print(copyArray[i] + " ");
        }//end of for
        return copyArray;
    }//end of Method copyOfArray
}//end of class
