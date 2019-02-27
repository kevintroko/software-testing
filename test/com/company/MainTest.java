package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    Main mn = new Main();
    int[] xArray = {1,2,3,4};

    @Test
    void findLastFail() {
        assertEquals(3, mn.findLast(xArray,4));
    }

    @Test
    void findLastPass() {
        assertEquals(0, mn.findLast(xArray,1));
    }

    @Test
    void findLastOneDimension() {
        int[] xOne = {0};
        assertEquals(0, mn.findLast(xOne,0));
    }

    @Test
    void question13() {
        int[] x13 = {2,3,5};
        assertEquals(0, mn.findLast(x13,2));
    }
}
