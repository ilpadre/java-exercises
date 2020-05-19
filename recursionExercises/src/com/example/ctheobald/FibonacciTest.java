package com.example.ctheobald;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void Fib_1_Returns_0_Test() {
        //arrange
        Fibonacci fib = new Fibonacci();

        //act
        long result = fib.fibonacci(1);

        //assert
        assertEquals(0, result);

    }

    @Test
    public void Fib_6_Returns_5_Test() {
        //arrange
        Fibonacci fib = new Fibonacci();

        //act
        long result = fib.fibonacci(6);

        //assert
        assertEquals(5, result);

    }

    @Test
    public void Fib_10_Returns_34_Test() {
        //arrange
        Fibonacci fib = new Fibonacci();

        //act
        long result = fib.fibonacci(10);

        //assert
        assertEquals(34, result);

    }

    @Test
    public void Fib_15_Returns_377_Test() {
        //arrange
        Fibonacci fib = new Fibonacci();

        //act
        long result = fib.fibonacci(15);

        //assert
        assertEquals(377, result);

    }

    @Test
    public void Fib_20_Returns_4181_Test() {
        //arrange
        Fibonacci fib = new Fibonacci();

        //act
        long result = fib.fibonacci(20);

        //assert
        assertEquals(4181, result);

    }
}