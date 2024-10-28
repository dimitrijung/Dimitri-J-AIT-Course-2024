package homework_30.bestCityForHoliday;

//      -сортировка по умолчанию
//      -сортировка по 2-м критериям
//      -поиск в массиве с помощью Arrays.binarySearch()

import classwork_30.soldier.Soldier;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class CityTest {

    City[] cities;

    @BeforeEach
    void setUp() {

        cities = new City[]{
                new City("Valencia", 800_600,90, 8.0),
                new City("Barcelona", 1_636_190,150, 9.5),
                new City("Lissabon", 3_030_000,110, 8.5),
                new City("Porto", 231_800,90, 7.0)
        };
    }

//--- отсортировать города по населению (сортировка по умолчанию) ---

    @Test
    void nativeSortingTest () {
        System.out.println("------------- Print as is --------------");
        printArray(cities);
        Arrays.sort(cities);
        System.out.println("------------- Print after native sorting --------------");
        printArray(cities);

    }

//--- сортировка по 2-м критериям ---

    @Test
    void sortingBy2Criteria (){
        Comparator<City> comparatorRentAndRate = new Comparator<City>() {
            @Override
            public int compare(City city1, City city2) {
                int res = Integer.compare(city1.getPrice(), city2.getPrice());
                return res != 0 ? res : Double.compare(city1.getRate(),city2.getRate());
            }
        };
        System.out.println("------------- Print as is --------------");
        printArray(cities);
        Arrays.sort(cities,comparatorRentAndRate);
        System.out.println("------------- Sorting by Price and Rate --------------");
        printArray(cities);
    }

//--- поиск в массиве по лучшему рейтингу с помощью Arrays.binarySearch() ---

@Test
void binarySearchTest(){
    System.out.println("------------- Print as is --------------");
    printArray(cities);
    Arrays.sort(cities, (city1,city2) ->Double.compare (city1.getRate(), city2.getRate()));
    System.out.println("------------- Sorting by Rate --------------");
    printArray(cities);

    City pattern = new City(null, 0,0,9.5);
    int index = Arrays.binarySearch(cities, pattern, (city1,city2) ->Double.compare (city1.getRate(), city2.getRate()));
    System.out.println("Index of best rate City is: " + index);
}


public void printArray (Object[] array){
    for (int i = 0; i < array.length; i++) {
        System.out.println(array[i]);
    }
}
}// end of class