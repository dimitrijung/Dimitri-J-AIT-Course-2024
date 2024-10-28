package homework_31.river;

import classwork_31.cities.City;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class RiverTest {

    River[] rivers;

    @BeforeEach
    void setUp() {

        rivers = new River[3];

        rivers[0] = new River("Themse", 350, 1179, 20);
        rivers[1] = new River("Seine", 700, 800.5, 35);
        rivers[2] = new River("Donau", 2850, 1500, 50);

    }
        public void printArray (Object[] array, String titleOfReport){
            System.out.println("--------------- " + titleOfReport + " ------------------- ");
            for (Object o : array) {
                System.out.println(o);
            }
    }
//--- Распечатать в отсортированном виде ---
//--- Есть ли в списке река с длинной 2850 km?

    @Test
    void comparableTest (){
        printArray(rivers,"List of rivers as is");
        Arrays.sort(rivers);
        printArray(rivers, "List of rivers sorted by length in km");
        River pattern = new River(null, 2850,0,0);
        int index = Arrays.binarySearch(rivers, pattern);
        System.out.println("River that you are searching for is on index: " + index);
    }

//--- Отсортируйте список по алфавиту ---
//--- Есть ли в списке река по имени  Seine? Какой онa имеет номер в списке? ---
    @Test
    void comparatorByNameTest (){
        Comparator<River> comparatorByName = new Comparator<River>() {
            @Override
            public int compare(River river1, River river2) {
                return river1.getName().compareTo(river2.getName());
            }
        };
        Arrays.sort(rivers,comparatorByName);
        printArray(rivers,"List of river sorted by name.");
        River pattern = new River("Seine",0,0,0);
        int index = Arrays.binarySearch(rivers,pattern,comparatorByName);
        if (index >= 0){
            System.out.println("Find river " + pattern.getName() + " on index: " + index);
        }else{
            System.out.println(" River with the name: " + pattern.getName() + "did not find!");
        }
    }

//--- Скопируйте массив в другой, имеющий в 2 раза большую длину ---
//--- Отсортируйте полученный массив ---
//--- Имеется ли в списке рек река Rhein?
//            "Rhein", 2100
    @Test
    void arrayCopyTest() {
        River[] riversCopy = Arrays.copyOf(rivers, rivers.length * 2);
        printArray(riversCopy, "riversCopy as is");

        Comparator<River> comparatorByName = Comparator.nullsLast((river1, river2) -> river1.getName().compareTo(river2.getName()));
// sorting
        Arrays.sort(riversCopy, comparatorByName);
// print
        printArray(riversCopy, "riversCopy after sorting by name1");
// searching for river "Rhein"
        River pattern = new River("Rhein",0,0,0);
        int index = Arrays.binarySearch(riversCopy,0,rivers.length,pattern,comparatorByName);
        System.out.println(index);
    }
//--- Вставьте реку Rhein в список, сохранив порядок сортировки по длинне  (!)
//--- Вставляем в имеющийся список

    @Test
    void insertKeepSortingTest(){
        Arrays.sort(rivers);// sorting by default (length)
        printArray(rivers,"Native sorting");
// increase up the massiv length
        River[] riversCopy4 = Arrays.copyOf(rivers, rivers.length +1);
        River river = new River("Rhein", 2100, 300, 50);
        int index = Arrays.binarySearch(riversCopy4, 0, riversCopy4.length -1, river);
        index = index >=0 ? index : - index -1; // обработка индекса
// подготовили место для вставки
        System.arraycopy(riversCopy4, index, riversCopy4, index + 1, riversCopy4.length - index -1);
        riversCopy4[index] = river;
        rivers = riversCopy4; // переопределили ссылку на массив
        printArray(rivers, "List with add river");
    }



}// end of class