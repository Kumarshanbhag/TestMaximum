package com.genericstest;

import com.generics.MaximumCheck;
import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {
    @Test
    public void givenMaximumIntegerNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(3, 2, 1);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3,check);
    }

    @Test
    public void givenMaximumIntegerNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(2, 3, 1);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3,check);
    }

    @Test
    public void givenMaximumIntegerNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(1, 2, 3);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3,check);
    }

    @Test
    public void givenMaximumFloatNumberAtFirstPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(3.1f, 2.1f, 1.1f);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3.1f,check);
    }

    @Test
    public void givenMaximumFloatNumberAtSecondPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(2.1f, 3.1f, 1.1f);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3.1f,check);
    }

    @Test
    public void givenMaximumFloatNumberAtThirdPosition_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(1.1f, 2.1f, 3.1f);
        Comparable check = max.getMaximum();
        Assert.assertEquals(3.1f,check);
    }

    @Test
    public void givenMaximumStringAtFirstPosition_WhenProper_ShouldReturnSameString() {
        MaximumCheck max = new MaximumCheck("Peach", "Apple", "Banana");
        Comparable check = max.getMaximum();
        Assert.assertEquals("Peach",check);
    }

    @Test
    public void givenMaximumStringAtSecondPosition_WhenProper_ShouldReturnSameString() {
        MaximumCheck max = new MaximumCheck("Apple", "Peach", "Banana");
        Comparable check = max.getMaximum();
        Assert.assertEquals("Peach",check);
    }

    @Test
    public void givenMaximumStringAtThirdPosition_WhenProper_ShouldReturnSameString() {
        MaximumCheck max = new MaximumCheck("Banana", "Apple", "Peach");
        Comparable check = max.getMaximum();
        Assert.assertEquals("Peach",check);
    }

    @Test
    public void givenMaximumIntegerNumber_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(3, 2, 1, 5, 6);
        Comparable check = max.getMaximum();
        Assert.assertEquals(6,check);
    }

    @Test
    public void givenMaximumFloatNumber_WhenProper_ShouldReturnSameNumber() {
        MaximumCheck max = new MaximumCheck(1.1f, 2.1f, 3.1f, 5.5f, 6.1f);
        Comparable check = max.getMaximum();
        Assert.assertEquals(6.1f,check);
    }

    @Test
    public void givenMaximumString_WhenProper_ShouldReturnSameString() {
        MaximumCheck max = new MaximumCheck("Banana", "Apple", "Peach", "Grapes", "Pineapple");
        Comparable check = max.getMaximum();
        Assert.assertEquals("Pineapple",check);
    }
}
