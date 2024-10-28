package homework_22;

import classwork_14.ArrayMethods;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array100Test {

    @BeforeEach
    void setUp() {

    }// end of setUp

    @Test
    void randomArrayTest(){
        int[] myArray = Array.randomArray();
        System.out.println(myArray);
    }// end randomArrayTest

    @Test
    void countPositiveNumbersTest (){
        int[] x = {0,1,2,-3,4,5};
        //int res = Array.countPositiveNumbers(x);
        assertEquals(4,Array.countPositiveNumbers(x));

    }



}// end of class