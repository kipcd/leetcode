import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArraysDuplicateZerosTest {

    private final ArraysDuplicateZeros.Solution solution = new ArraysDuplicateZeros().new Solution();

    @Test
    public void duplicateZeros_arrayWithoutZeros() {
        int[] testArray = {1,2,3};
        solution.duplicateZeros(testArray);
        assertArrayEquals(new int[]{1, 2, 3}, testArray);
    }

    @Test
    public void duplicateZeros_arrayWithZeros() {
        int[] testArray = {1, 0, 2, 3, 0, 4, 5, 0};
        int[] expectedArray = {1, 0, 0, 2, 3, 0, 0, 4};
        solution.duplicateZeros(testArray);
        assertArrayEquals(expectedArray, testArray);
    }
}