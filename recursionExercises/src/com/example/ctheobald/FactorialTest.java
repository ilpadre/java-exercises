package com.example.ctheobald;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void Fact_1_Returns_1_Test() {
        //arrange
        Factorial fact = new Factorial();

        //act
        long result = fact.factorial(1);

        //assert
        assertEquals(1, result);

    }

    @Test
    public void Fact_2_Returns_2_Test() {
        //arrange
        Factorial fact = new Factorial();

        //act
        long result = fact.factorial(2);

        //assert
        assertEquals(2, result);

    }

    @Test
    public void Fact_3_Returns_6_Test() {
        //arrange
        Factorial fact = new Factorial();

        //act
        long result = fact.factorial(3);

        //assert
        assertEquals(6, result);

    }

    @Test
    public void Fact_10_Returns_3628800_Test() {
        //arrange
        Factorial fact = new Factorial();

        //act
        long result = fact.factorial(10);

        //assert
        assertEquals(3628800, result);

    }

    @Test
    public void Fact_6_Returns_720_Test() {
        //arrange
        Factorial fact = new Factorial();

        //act
        long result = fact.factorial(6);

        //assert
        assertEquals(720, result);

    }
}