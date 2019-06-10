package com.zipcodewilmington.assessment2.part1;
import java.util.Arrays;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        Integer length = array.length;
        return (length % 2 ==0);
    }

    public Integer[] range(int start, int stop) {
        Integer length = stop - start;
        Integer[] answer = new Integer[length];
        for (int i = 0; start <= stop; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        Integer sum = array[0] + array[1];
        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        int length = array.length;
        Integer product = array[length-2] * array[length-1];
        return product;
    }
}
