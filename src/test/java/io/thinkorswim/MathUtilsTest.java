package io.thinkorswim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void test() {
        MathUtils calc = new MathUtils();
        int sum = calc.add(0, 1);

        if (sum != 1) {
            System.out.println("Test failed");
        }
    }

}