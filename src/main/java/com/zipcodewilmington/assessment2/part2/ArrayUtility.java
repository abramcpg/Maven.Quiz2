package com.zipcodewilmington.assessment2.part2;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.Arrays;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        int length = array1.length +array2.length;
        Integer[] answer = new Integer[length];
        for (int i = 0; i < array1.length; i++) {
            answer[i] = array1[i];
        }
        for (int i = (array1.length); i < length; i++) {
           answer[i] = array2[i - array1.length];
        }


        return answer;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] answer = new Integer[array.length];
        for (int i = 0; i < answer.length ; i++) {
            answer[(i+(answer.length-index)) % answer.length ] = array[i];
        }
        return answer;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
