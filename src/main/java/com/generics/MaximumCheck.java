package com.generics;

public class MaximumCheck {

    public Integer getMaximum(Integer number1, Integer number2, Integer number3) {
        Integer max = number1;
        if(number2.compareTo(max) > 0)
            max = number2;
        if(number3.compareTo(max) > 0)
            max = number3;
        return max;
    }

    public Float getMaximum(Float number1, Float number2, Float number3) {
        Float max = number1;
        if(number2.compareTo(max) > 0)
            max = number2;
        if(number3.compareTo(max) > 0)
            max = number3;
        return max;
    }

    public String getMaximum(String string1, String string2, String string3) {
        String max = string1;
        if(string2.compareTo(max) > 0)
            max = string2;
        if(string3.compareTo(max) > 0)
            max = string3;
        return max;
    }
}
