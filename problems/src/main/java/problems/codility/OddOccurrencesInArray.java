package problems.codility;

import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

    // Assuming that all but one of the values in A occurs an even number of times,
    // find the unique value of the element that occurs an odd number of times.
    public static int oddOccurrenceInArray(final int[] array) {

        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array should not be null or empty.");
        }

        final Map<Integer, Integer> counts = new HashMap<>();
        for (final int element : array) {
            final Integer count = counts.get(element);
            counts.put(element, count != null ? count + 1 : 1);
        }

        for (final Map.Entry<Integer, Integer> pair : counts.entrySet()) {
            if (pair.getValue() % 2 == 1) {
                return pair.getKey();
            }
        }

        throw new IllegalArgumentException(
                "Array does not contain an element that occurs an odd number of times.");
    }
}