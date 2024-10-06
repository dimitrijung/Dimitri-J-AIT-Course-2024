package homework_11;

// Написать метод, принимающий массив целых чисел, и возвращающий среднее арифметическое всех его элементов.
// Проверьте его работу на массиве ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

public class AgeOfGroup {

    public static void main(String[] args) {

        int[]  ageOfGroup = {47, 49, 37, 47, 52, 60, 44, 34, 38, 59, 18, 38, 35, 41, 18, 43};

        double result = averageAge(ageOfGroup);
        System.out.println(result);


    }// end of main
        private static double averageAge (int[] array) {
        int totalAge = 0;

            for (int i = 0; i < array.length; i++) {
            totalAge = totalAge + array[i];
            }// end of for
            double avgAge=  totalAge / array.length;
            return avgAge;
        }// end of method averageAge
}// end of class
