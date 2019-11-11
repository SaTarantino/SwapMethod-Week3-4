package unaryPredicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsOddTest {

    /**
     * Test for IsOdd class.
     */

    private IsOdd predicate = new IsOdd();

    @Test
    void testZero() {
        assertFalse(predicate.test(0));
    }

    @Test
    void testOne() {
        assertTrue(predicate.test(1));
    }

    @Test
    void testTwo() {
        assertFalse(predicate.test(2));
    }

    @Test
    void testThree() {
        assertTrue(predicate.test(3));
    }

    @Test
    void testNegativeOne() {
        assertTrue(predicate.test(-1));
    }

    @Test
    void testNegativeTwo() {
        assertFalse(predicate.test(-2));
    }

    @Test
    void testNegativeThree() {
        assertTrue(predicate.test(-3));
    }

    @Test
    void testBigEven() {
        assertFalse(predicate.test((2*((Integer.MAX_VALUE-1)/2))));
    }

    @Test
    void testBigOdd() {
        assertTrue(predicate.test(2*((Integer.MAX_VALUE-1)/2)-1));
    }

    @Test
    void testBigNegativeEven() {
        assertFalse(predicate.test(2*((Integer.MIN_VALUE+1)/2)));
    }

    @Test
    void testBigNegativeOdd() {
        assertTrue(predicate.test(2*((Integer.MIN_VALUE+1)/2)+1));
    }
}
