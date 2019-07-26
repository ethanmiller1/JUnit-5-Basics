package io.thinkorswim;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Testing add method")
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

    @Test
    @Disabled
    @DisplayName("TDD method. Should not run.")
    void testDisabled() {
        fail("This test should be disabled");
    }
}