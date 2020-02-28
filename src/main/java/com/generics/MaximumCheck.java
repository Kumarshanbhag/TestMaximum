package com.generics;

import java.util.Arrays;
import java.util.Collections;

public class MaximumCheck<E extends Comparable<E>> {
    private final E number1;
    private final E number2;
    private final E number3;
    private final E[] value;

    public MaximumCheck(E number1, E number2, E number3, E ...value) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.value = value;
    }

    public static <E extends Comparable<E>> E getMaximum(E number1, E number2, E number3, E ...value) {
        E max = number1;
        if(number2.compareTo(max) > 0)
            max = number2;
        if(number3.compareTo(max) > 0)
            max = number3;
        if(value.length !=0) {
            Arrays.sort(value, Collections.reverseOrder());
            if(value[0].compareTo(max) > 0)
                max = value[0];
        }
        return max;
    }

    public E getMaximum() {
        return getMaximum(number1, number2, number3, value);
    }
}