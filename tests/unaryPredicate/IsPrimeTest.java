package unaryPredicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsPrimeTest {

    private IsPrime predicate = new IsPrime();

    @Test
    void testZero() {
        assertFalse(predicate.test(0));
    }

    @Test
    void testOne() {
        assertFalse(predicate.test(1));
    }

    @Test
    void testTwo() {
        assertTrue(predicate.test(2));
    }

    @Test
    void testThree() {
        assertTrue(predicate.test(3));
    }

    @Test
    void testFour() {
        assertFalse(predicate.test(4));
    }

    @Test
    void testFive() {
        assertTrue(predicate.test(5));
    }

    @Test
    void testSix() {
        assertFalse(predicate.test(6));
    }

    @Test
    void testSeventeen() {
        assertTrue(predicate.test(17));
    }

    @Test
    void testTwentyFive() {
        assertFalse(predicate.test(25));
    }

    @Test
    void testNegativeTwo() {
        assertFalse(predicate.test(-2));
    }

    @Test
    void testNegativeThree() {
        assertFalse(predicate.test(-3));
    }

    @Test
    void testNegativeFour() {
        assertFalse(predicate.test(-4));
    }

    @Test
    void testBigPrime() {
        assertTrue(predicate.test(99991));
    }

    @Test
    void testBigNotPrime() {
        assertFalse(predicate.test(99992));
    }

    @Test
    void testVeryBigPrime() {
        assertTrue(predicate.test(982451653));
    }

    @Test
    void testVeryBigNotPrime() {
        assertFalse(predicate.test(982451654));
    }

    @Test
    void testMaxPrime() {
        assertTrue(predicate.test(Integer.MAX_VALUE));
    }

    @Test
    void testMaxNotPrime() {
        assertFalse(predicate.test(Integer.MAX_VALUE-1));
    }
}
