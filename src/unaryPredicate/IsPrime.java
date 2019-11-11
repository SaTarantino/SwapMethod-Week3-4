package unaryPredicate;

/**
 * author Salvatore Tarantino
 * u1860830@hud.ac.uk
 */

public class IsPrime implements UnaryPredicate<Integer> {

    /**
     * Test if a number n is a prime number.
     *
     * @param n
     * @return true if n is prime
     */

    @Override
    public boolean test(Integer n) {

        // Check if n is greater than 2, if not, return false.
        if (n < 2) {
            return false;
        }

        // Check if n is equal at 2 or 3, if so return true.
        else if (n <= 3) {
            return true;
        }

        // Check if n divided by 2 give remainder, if not the number is even so can't be prime.
        else if (n % 2 == 0) {
            return false;
        }

        // A for loop that check for a possible dividend for n.
        // If there is one the number is not prime and return false, else return true.

        for (int i = 3; i < n; i = i+2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
