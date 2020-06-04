package com.example.ctheobald;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void BS_ArrayValue10_Returns_4_Test() {
        //arrange
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 7, 10};

        //act
        int result = bs.binarySearch(10, array, 0, array.length);

        //assert
        assertEquals(4, result);

    }

    @Test
    public void BS_ArrayValue4_Returns_2_Test() {
        //arrange
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 7, 10, 12, 15};

        //act
        int result = bs.binarySearch(4, array, 0, array.length);

        //assert
        assertEquals(2, result);

    }

    @Test
    public void BS_ArrayValue20_Returns_7_Test() {
        //arrange
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 7, 10, 12, 15, 20, 40};

        //act
        int result = bs.binarySearch(20, array, 0, array.length);

        //assert
        assertEquals(7, result);

    }

    @Test
    public void BS_ArrayValue2_Returns_0_Test() {
        //arrange
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 7, 10, 12, 15, 20, 40};

        //act
        int result = bs.binarySearch(2, array, 0, array.length);

        //assert
        assertEquals(0, result);

    }

    @Test
    public void BS_ArrayValue3_Returns_1_Test() {
        //arrange
        BinarySearch bs = new BinarySearch();
        int[] array = {2, 3, 4, 7, 10, 12, 15, 20, 40};

        //act
        int result = bs.binarySearch(3, array, 0, array.length);

        //assert
        assertEquals(1, result);

    }
}