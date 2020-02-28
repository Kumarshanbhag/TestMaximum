package com.generics;

public class MaximumCheck<E extends Comparable<E>> {
    private final E number1;
    private final E number2;
    private final E number3;

    public MaximumCheck(E number1, E number2, E number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public <E extends Comparable<E>> E getMaximum(E number1, E number2, E number3) {
        E max = number1;
        if(number2.compareTo(max) > 0)
            max = number2;
        if(number3.compareTo(max) > 0)
            max = number3;
        return max;
    }

    public E getMaximum() {
        return getMaximum(number1, number2, number3);
    }
}
