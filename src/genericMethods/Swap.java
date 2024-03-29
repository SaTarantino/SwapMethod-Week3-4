package genericMethods;

/**
 * author Salvatore Tarantino, u1860830
 * u1860830@hud.ac.uk
 */

public class Swap {

    static <T> T[] swap(T[] array, int index1, int index2) throws IndexError {

        /**
         * Swap method that take as arguments an array T and two integers for the index.
         * If the values are too big or too small, thrown an error.
         *
         * @param <T> the type of array
         * @param index1 the first index
         * @param index2 the second index
         * @return the array T with index1 and index2 swapped
         */

        if (index1 > array.length || index2 > array.length || index1 < 0 || index2 < 0) {
            throw new IndexError();
        } else{
            T box = array[index1];
            array[index1] = array[index2];
            array[index2] = box;
        }
        return array;
    }
}
