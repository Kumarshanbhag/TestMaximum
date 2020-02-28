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

    @Test
    public void givenMaximumFloatNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        Float check = max.getMaximum(3.1f, 2.1f, 1.1f);
        Assert.assertEquals(3.1f,check,0.0f);
    }

    @Test
    public void givenMaximumFloatNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        Float check = max.getMaximum(2.1f, 3.1f, 1.1f);
        Assert.assertEquals(3.1f,check,0.0f);
    }

    @Test
    public void givenMaximumFloatNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        Float check = max.getMaximum(1.1f, 2.1f, 3.1f);
        Assert.assertEquals(3.1f,check,0.0f);
    }

    @Test
    public void givenMaximumStringAtFirstPosition_WhenProper_ShouldReturnSameString() {
        String check = max.getMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach",check);
    }

    @Test
    public void givenMaximumStringAtSecondPosition_WhenProper_ShouldReturnSameString() {
        String check = max.getMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach",check);
    }

    @Test
    public void givenMaximumStringAtThirdPosition_WhenProper_ShouldReturnSameString() {
        String check = max.getMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach",check);
    }
}
