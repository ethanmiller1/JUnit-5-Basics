package io.thinkorswim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void add() {
        MathUtils mathUtils = new MathUtils();
        int expected = 1;
        int actual = mathUtils.add(0, 1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void computeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }
}