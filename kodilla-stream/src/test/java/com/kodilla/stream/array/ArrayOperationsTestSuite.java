package com.kodilla.stream.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    void testGetAverage() {
        //given
        int [] numbers = new int [10];
        numbers[0] = 2;
        numbers[1] = 3;
        numbers[2] = 4;
        numbers[3] = 4;
        numbers[4] = 7;
        numbers[5] = 5;
        numbers[6] = 2;
        numbers[7] = 9;
        numbers[8] = 1;
        numbers[9] = 9;

        //when
        double average = getAverage(numbers);


        //then
        assertEquals(average,4.6);
        }

}
