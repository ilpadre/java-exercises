package com.example.ctheobald;

import com.example.ctheobald.GreatestCommonDivisor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    @Test
    public void GCD_30_36_Returns_6_Test() {
        //arrange
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        //act
        int result = gcd.greatestCommonDivisor(30, 36);

        //assert
        assertEquals(6, result);

    }

    @Test
    public void GCD_100_100_Returns_100_Test() {
        //arrange
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        //act
        int result = gcd.greatestCommonDivisor(100, 100);

        //assert
        assertEquals(100, result);

    }

    @Test
    public void GCD_15_20_Returns_5_Test() {
        //arrange
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        //act
        int result = gcd.greatestCommonDivisor(15, 20);

        //assert
        assertEquals(5, result);

    }

    @Test
    public void GCD_350_700_Returns_350_Test() {
        //arrange
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        //act
        int result = gcd.greatestCommonDivisor(350, 700);

        //assert
        assertEquals(350, result);

    }

    @Test
    public void GCD_255_159_Returns_3_Test() {
        //arrange
        GreatestCommonDivisor gcd = new GreatestCommonDivisor();

        //act
        int result = gcd.greatestCommonDivisor(255, 159);

        //assert
        assertEquals(3, result);

    }
}