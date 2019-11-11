package unaryPredicate;

public class IsOdd implements UnaryPredicate<Integer>{

    /**
     * Test if a number n is odd.
     *
     * Salvatore Tarantino u1860830@hud.ac.uk
     */

    @Override
    public boolean test(Integer n) {
        return n % 2 != 0;
    }
}
