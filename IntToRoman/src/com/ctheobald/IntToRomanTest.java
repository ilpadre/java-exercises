package com.ctheobald;

import com.ctheobald.IntToRoman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntToRomanTest {

    @Test
    public void Int_1_Returns_I_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(1);

        //assert
        assertEquals("I", result);

    }

    @Test
    public void Int_2_Returns_II_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(2);

        //assert
        assertEquals("II", result);

    }

    @Test
    public void Int_3_Returns_III_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(3);

        //assert
        assertEquals("III", result);

    }

    @Test
    public void Int_4_Returns_IV_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(4);

        //assert
        assertEquals("IV", result);

    }

    @Test
    public void Int_5_Returns_V_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(5);

        //assert
        assertEquals("V", result);

    }

    @Test
    public void Int_6_Returns_VI_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(6);

        //assert
        assertEquals("VI", result);

    }

    @Test
    public void Int_9_Returns_IX_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(9);

        //assert
        assertEquals("IX", result);

    }

    @Test
    public void Int_10_Returns_X_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(10);

        //assert
        assertEquals("X", result);

    }

    @Test
    public void Int_11_Returns_XI_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(11);

        //assert
        assertEquals("XI", result);

    }

    @Test
    public void Int_14_Returns_XIV_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(14);

        //assert
        assertEquals("XIV", result);

    }

    @Test
    public void Int_15_Returns_XV_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(15);

        //assert
        assertEquals("XV", result);

    }

    @Test
    public void Int_16_Returns_XVI_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(16);

        //assert
        assertEquals("XVI", result);

    }

    @Test
    public void Int_19_Returns_XIX_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(19);

        //assert
        assertEquals("XIX", result);

    }

    @Test
    public void Int_20_Returns_XX_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(20);

        //assert
        assertEquals("XX", result);

    }

    @Test
    public void Int_21_Returns_XXI_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(21);

        //assert
        assertEquals("XXI", result);

    }
    @Test
    public void Int_24_Returns_XXIV_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(24);

        //assert
        assertEquals("XXIV", result);

    }

    @Test
    public void Int_25_Returns_XXV_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(25);

        //assert
        assertEquals("XXV", result);

    }

    @Test
    public void Int_50_Returns_L_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(50);

        //assert
        assertEquals("L", result);

    }

    @Test
    public void Int_100_Returns_C_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(100);

        //assert
        assertEquals("C", result);

    }

    @Test
    public void Int_500_Returns_D_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(500);

        //assert
        assertEquals("D", result);

    }

    @Test
    public void Int_1000_Returns_M_Test() {
        //arrange
        IntToRoman rmc = new IntToRoman();

        //act
        String result = rmc.intToRoman(1000);

        //assert
        assertEquals("M", result);

    }




}
