package io.thinkorswim;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void add() {
        int expected = 1;
        int actual = mathUtils.add(0, 1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }

    @Test
    void subtract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw");
    }
}