package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteValueTest {

    private DeleteValue.Solution solution = new DeleteValue().new Solution();

    @Test
    public void removeElement_case1() {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int expectedLength = 2;
        int expectedArray[] = {2, 2, 2, 3};

        int resultLength = solution.removeElement(nums, val);

        assertArrayEquals(expectedArray, nums);
        assertEquals(expectedLength, resultLength);
    }

    @Test
    public void removeElement_case2() {
        int nums[] = {2, 3, 3, 2};
        int val = 3;
        int expectedLength = 2;
        int expectedArray[] = {2, 2, 3, 2};

        int resultLength = solution.removeElement(nums, val);

        assertArrayEquals(expectedArray, nums);
        assertEquals(expectedLength, resultLength);
    }

    @Test
    public void removeElement_case3() {
        int nums[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int expectedLength = 5;
        int expectedArray[] = {0, 1, 4, 0, 3, 0, 4, 2};

        int resultLength = solution.removeElement(nums, val);

        assertArrayEquals(expectedArray, nums);
        assertEquals(expectedLength, resultLength);
    }
}