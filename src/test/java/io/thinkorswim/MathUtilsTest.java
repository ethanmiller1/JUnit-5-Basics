package io.thinkorswim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils mathUtils = new MathUtils();
        int expected = 1;
        int actual = mathUtils.add(0, 1);
        assertEquals(expected, actual);
    }

}