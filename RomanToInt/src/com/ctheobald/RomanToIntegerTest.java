package com.ctheobald;

import com.ctheobald.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTest {

    @Test
    public void I_Returns_1_Test() {
        //arrange
        RomanToInteger rmc = new RomanToInteger();

        //act
        int result = rmc.romanToDecimal("I");

        //assert
        assertEquals(1, result);

    }

    @Test
    public void II_Returns_2_Test(){
        //arrange
        RomanToInteger rmc = new RomanToInteger();

        //act
        int result = rmc.romanToDecimal("II");

        //assert
        assertEquals(2, result);
    }

    @Test
    public void III_Returns_3_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("III");

        assertEquals(3,result);
    }

    @Test
    public void IV_Returns_4_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("IV");

        assertEquals(4,result);

    }

    @Test
    public void V_Returns_5_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("V");

        assertEquals(5,result);
    }

    @Test
    public void VI_Returns_6_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("VI");

        assertEquals(6,result);
    }

    @Test
    public void IX_Returns_9_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("IX");

        assertEquals(9, result);
    }

    @Test
    public void X_Returns_10_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("X");

        assertEquals(10, result);
    }

    @Test
    public void XI_Returns_11_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XI");

        assertEquals(11, result);
    }

    @Test
    public void XIV_Returns_14_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XIV");

        assertEquals(14, result);
    }

    @Test
    public void XV_Returns_15_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XV");

        assertEquals(15, result);
    }

    @Test
    public void XVI_Returns_16_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XVI");

        assertEquals(16, result);
    }

    @Test
    public void XIX_Returns_19_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XIX");

        assertEquals(19, result);
    }

    @Test
    public void XX_Returns_20_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XX");

        assertEquals(20, result);
    }

    @Test
    public void XXI_Returns_21_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XXI");

        assertEquals(21, result);
    }

    @Test
    public void XXIV_Returns_24_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XXIV");

        assertEquals(24, result);
    }

    @Test
    public void XXV_Returns_25_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("XXV");

        assertEquals(25, result);
    }

    @Test
    public void L_Returns_50_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("L");

        assertEquals(50, result);
    }

    @Test
    public void C_Returns_100_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("C");

        assertEquals(100, result);
    }

    @Test
    public void D_Returns_500_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("D");

        assertEquals(500, result);
    }

    @Test
    public void M_Returns_1000_Test() {
        RomanToInteger rmc = new RomanToInteger();

        int result = rmc.romanToDecimal("M");

        assertEquals(1000, result);
    }


}
