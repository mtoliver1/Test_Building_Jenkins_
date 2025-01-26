package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void setUp() {
        mathUtils = new MathUtils();
    }

    @AfterEach
    void tearDown() {
        mathUtils = null;
    }

    @Test
    void testAdd() {
        assertEquals(15, mathUtils.add(10, 5), "Adding 10 and 5 should return 15");
        assertEquals(-5, mathUtils.add(-10, 5), "Adding -10 and 5 should return -5");
        assertEquals(0, mathUtils.add(0, 0), "Adding 0 and 0 should return 0");
    }

    @Test
    void testSubtract() {
        assertEquals(5, mathUtils.subtract(10, 5), "Subtracting 5 from 10 should return 5");
        assertEquals(-15, mathUtils.subtract(-10, 5), "Subtracting 5 from -10 should return -15");
        assertEquals(0, mathUtils.subtract(0, 0), "Subtracting 0 from 0 should return 0");
    }

    @Test
    void testMultiply() {
        assertEquals(50, mathUtils.multiply(10, 5), "Multiplying 10 by 5 should return 50");
        assertEquals(-50, mathUtils.multiply(-10, 5), "Multiplying -10 by 5 should return -50");
        assertEquals(0, mathUtils.multiply(0, 5), "Multiplying 0 by 5 should return 0");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, mathUtils.divide(10, 5), 0.001, "Dividing 10 by 5 should return 2.0");
        assertEquals(-2.0, mathUtils.divide(-10, 5), 0.001, "Dividing -10 by 5 should return -2.0");
        assertEquals(0.0, mathUtils.divide(0, 5), 0.001, "Dividing 0 by 5 should return 0.0");
        assertEquals(-1.0, mathUtils.divide(10, 0), 0.001, "Dividing by 0 should return -1.0");
    }
}
