package com.company;

import org.junit.Test;

public class printest2 {
    @Test
    public void testC() throws Exception {

        Printer print = new Printer();

        Integer[] array = {200000, 2345, 3000,40000,56789,6789090,
        78532,5,56789,78,345,76,13,-12,0};

        // Вызов метода getMin () для получения минимального значения
        print.<Integer>print(array);
        // Integer min = getMin(array);
        Printer1<Integer> min = new Printer1<Integer>(getMin(array));
        //  Printer1<Integer> minc = new Printer1<Integer>(getMin1(array));
        Integer min1 = min.min1();


        System.out.println("\nMinimum Value is: " + min1);

    }

    // здесь находим минимум
    public static int getMin(Integer[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}

