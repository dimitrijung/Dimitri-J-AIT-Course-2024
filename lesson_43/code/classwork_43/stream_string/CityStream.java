package classwork_43.stream_string;

//Возьмите список городов, отфильтруйте только те названия, которые начинаются с заданной буквы,
//преобразуйте их в верхний регистр и выведите в алфавитном порядке.
//"Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CityStream {

    public static void main(String[] args) {

        List<String> cityList = new ArrayList<>(Arrays.asList("Augsburg", "Munich", "berlin", "Heidelberg", "Worms", "Frankfurt am Main", "Bremen", "Bonn", "Braunschweig"));

        char firstLetter = 'b';

        List<String> result = filterCities(cityList, firstLetter);
        // Collections.reverse(result);
        result.forEach(System.out::println);
    }

    private static List<String> filterCities(List<String> cityList, char firstLetter) {
        return cityList.stream()
                .filter(city -> city.toLowerCase().startsWith(String.valueOf(firstLetter))) //
                .map(String::toUpperCase) //
                .sorted() //
                .toList();//
    }

}
