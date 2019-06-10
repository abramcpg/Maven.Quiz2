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
        Integer answer = 0;
        for (int i = 0; i < array1.length ; i++) {
            if(array1[i] == valueToEvaluate) answer++;
        }
        for (int i = 0; i < array2.length ; i++) {
            if(array2[i] == valueToEvaluate) answer++;
        }
        return answer;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int max = 1;
        int res = array[0];
        int count = 1;

        for (int i = 1; i < array.length ; i++) {
            if(array[i] == array[i-1])
                count++;
            else{
                if (count > max){
                    max = count;
                    res = array[i-1];
                }
                count = 1;
            }
        }
        if (count > max){
            max = count;
            res = array[array.length - 1];
        }

        return res;
    }
}
