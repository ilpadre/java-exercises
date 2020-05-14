package com.ctheobald;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsTest {

    @Test
        public void abc_def_returns_adbecf_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("abc", "def");

        //assert
        assertEquals("adbecf", result);

    }

    @Test
    public void ab_def_returns_adbef_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("ab", "def");

        //assert
        assertEquals("adbef", result);

    }

    @Test
    public void abc_de_returns_adbec_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("abc", "de");

        //assert
        assertEquals("adbec", result);

    }

    @Test
    public void a_b_returns_ab_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("a", "b");

        //assert
        assertEquals("ab", result);

    }

    @Test
    public void emptyString_returns_spaces_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("", "b c");

        //assert
        assertEquals("b c", result);

    }

    @Test
    public void qwertyuiop_asdfghjkl_returns_qawsedrftgyhujikolp_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("qwertyuiop", "asdfghjkl");

        //assert
        assertEquals("qawsedrftgyhujikolp", result);

    }

    @Test
    public void noInput_Test() {
        //arrange
        MergeStrings mergeStrings = new MergeStrings();

        //act
        String result = mergeStrings.mergeStrings("", "");

        //assert
        assertEquals("", result);

    }
}