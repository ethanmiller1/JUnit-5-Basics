package io.thinkorswim;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {

    MathUtils mathUtils;

    @BeforeAll
    static void beforeAllInit() {
        System.out.println("This needs to run before all");
    }

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void cleanup() {
        System.out.print("Cleaning up...");
    }

    // Nest methods inside a class to test multiple test cases.
    @Nested
    @DisplayName("Testing add method")
    class Add {

        @Test
        @DisplayName("When adding two positive numbers")
        void addPositive() {
            int expected = 1;
            int actual = mathUtils.add(0, 1);
            assertEquals(expected, actual, "The add method should add two numbers");
        }

        @Test
        @DisplayName("When adding two negative numbers")
        void addNegative() {
            int expected = -2;
            int actual = mathUtils.add(-1, -1);
            assertEquals(expected, actual, () -> "Should return " + expected + " but returned " + actual);
        }
    }

    @Test
    void computeCircleArea() {
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "Should return right circle area");
    }

    @Test
    void subtract() {
    }

    // Use assert all to avoid nesting methods inside a class to test multiple test cases.
    @Test
    @DisplayName("Multiply method")
    void multiply() {
        // assertEquals(4, mathUtils.multiply(2, 2), "Should return the right product");
        assertAll(
                () -> assertEquals(4, mathUtils.multiply(2, 2)),
                () -> assertEquals(0, mathUtils.multiply(2, 0)),
                () -> assertEquals(-2, mathUtils.multiply(2, -1))
        );
    }

    @Test
    void divide() {
        // If required conditions are false, skip test.
        boolean isServerUp = false;
        assumeTrue(isServerUp);
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "Divide by zero should throw");
    }

    @Test
    @Disabled
    @DisplayName("TDD method. Should not run.")
    void testDisabled() {
        fail("This test should be disabled");
    }

    @RepeatedTest(value = 3)
    @DisplayName("Repeated Test")
    void repeatTest(RepetitionInfo repetitionInfo) {
        int number = repetitionInfo.getCurrentRepetition();
        assertEquals(1, 2 - 1, "Failed at " + number);
    }
}