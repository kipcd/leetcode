package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedSquaresTest {
    private final SortedSquares.Solution solution =new SortedSquares().new Solution();

    @Test
    public void sortedSquares() {
        int[] sampleInts = {-4,-1,0,3,10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = solution.sortedSquares(sampleInts);
        assertArrayEquals(expected, result);
    }

    @Test
    public void sortedSquares_shouldSortArrayWithLength2() {
        int[] sampleInts = {-2, 0};
        int[] expected = {0, 4};
        int[] result = solution.sortedSquares(sampleInts);
        assertArrayEquals(expected, result);
    }
}