package unaryPredicate;

/**
 * author Salvatore Tarantino
 * u1860830@hud.ac.uk
 */

public class IsOdd implements UnaryPredicate<Integer>{

    /**
     * Test whether a number n is odd.
     *
     * @param n
     * @return true if n is odd
     */

    @Override
    public boolean test(Integer n) {
        return n % 2 != 0;
    }
}
