package com.generics;

public class MaximumCheck {
    public <E extends Comparable<E>> E getMaximum(E number1, E number2, E number3) {
        E max = number1;
        if(number2.compareTo(max) > 0)
            max = number2;
        if(number3.compareTo(max) > 0)
            max = number3;
        return max;
    }
}
