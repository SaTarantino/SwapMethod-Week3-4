package genericMethods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static genericMethods.Swap.swap;
import static org.junit.jupiter.api.Assertions.*;

/**
 * author Salvatore Tarantino, u1860830
 * u1860830@hud.ac.uk
 */

class SwapTest {

    /**
     * A set of tests for the Swap class.
     * Two different kind of array are tested, both Strings and Integers.
     */

    private String[] stringsArray = {"a", "b", "c", "d", "e", "f", "g"};
    private Integer[] intArray = {17, 34, 51, 68, 85, 102, 119};

    @Test
    void testStringTrueOne() throws IndexError {
        swap(stringsArray, 0, 1);
        assertTrue(Equals.equals(stringsArray[0], "b"));
        assertTrue(Equals.equals(stringsArray[1], "a"));
        System.out.println(Arrays.toString(stringsArray));
    }

    @Test
    void testIntTrueOne() throws IndexError {
        swap(intArray, 3, 4);
        assertTrue(Equals.equals(intArray[3], 85));
        assertTrue(Equals.equals(intArray[4], 68));
    }

    @Test
    void testStringTrueTwo() throws IndexError {
        swap(stringsArray, 1, 5);
        assertTrue(Equals.equals(stringsArray[1], "f"));
        assertTrue(Equals.equals(stringsArray[5], "b"));
    }

    @Test
    void testIntTrueTwo() throws IndexError {
        swap(intArray, 0, 6);
        assertTrue(Equals.equals(intArray[0], 119));
        assertTrue(Equals.equals(intArray[6], 17));
    }

    @Test
    void testStringFalseOne() throws IndexError{
        swap(stringsArray, 2, 6);
        assertFalse(Equals.equals(stringsArray[2], "c"));
        assertTrue(Equals.equals(stringsArray[2], "g"));
        assertFalse(Equals.equals(stringsArray[6], "g"));
        assertTrue(Equals.equals(stringsArray[6], "c"));
    }

    @Test
    void testIntFalseOne() throws IndexError{
        swap(intArray, 3, 5);
        assertFalse(Equals.equals(intArray[3], 68));
        assertTrue(Equals.equals(intArray[3], 102));
        assertFalse(Equals.equals(intArray[5], 102));
        assertTrue(Equals.equals(intArray[5], 68));
    }

    @Test
    void testStringIndexErrorOne() throws IndexError {
        try {
            swap(stringsArray, 0, 10);
            fail();
        } catch (IndexError indexError) {
        }
    }

    @Test
    void testStringIndexErrorTwo() throws IndexError {
        try {
            swap(stringsArray, -1, 1);
            fail();
        } catch (IndexError indexError) {
        }
    }

    @Test
    void testIntegersIndexErrorOne() throws IndexError {
        try {
            swap(intArray, 0, 10);
            fail();
        } catch (IndexError indexError) {
        }
    }

    @Test
    void testIntegersIndexErrorTwo() throws IndexError {
        try {
            swap(intArray, -1, 1);
            fail();
        } catch (IndexError indexError) {
        }
    }
}
