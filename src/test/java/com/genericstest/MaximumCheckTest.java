package com.genericstest;

import com.generics.MaximumCheck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumCheckTest {
    MaximumCheck max;

    @Before
    public void setUp() throws Exception {
        max = new MaximumCheck();
    }

    @Test
    public void givenMaximumIntegerNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        Integer check = max.getMaximum(3, 2, 1);
        Assert.assertEquals(3,check,0);
    }

    @Test
    public void givenMaximumIntegerNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        Integer check = max.getMaximum(2, 3, 1);
        Assert.assertEquals(3,check,0);
    }

    @Test
    public void givenMaximumIntegerNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        Integer check = max.getMaximum(1, 2, 3);
        Assert.assertEquals(3,check,0);
    }
}
