package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSorted3Test {
    private final MergeSorted3.Solution solution = new MergeSorted3().new Solution();

    @Test
    public void merge() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void merge_one_array_is_empty() {
        int nums1[] = {1};
        int m = 1;
        int nums2[] = {};
        int n = 0;
        int expected[] = {1};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

    }

    @Test
    public void merge_secondArrayLength_1() {
        int nums1[] = {2, 0};
        int m = 1;
        int nums2[] = {1};
        int n = 1;
        int expected[] = {1, 2};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

    @Test
    public void merge_firstArrayLength_1() {
        int[] nums1 = {-12, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int m = 1;
        int[] nums2 = {-49, -45, -42, -41, -40, -39, -39, -39, -38, -36, -34, -34, -33, -33, -32, -31, -29, -28, -26, -26, -24, -21, -20, -20, -18, -16, -16, -14, -11, -7, -6, -5, -4, -4, -3, -3, -2, -2, -1, 0, 0, 0, 2, 2, 6, 7, 7, 8, 10, 10, 13, 13, 15, 15, 16, 17, 17, 19, 19, 20, 20, 20, 21, 21, 22, 22, 24, 24, 25, 26, 27, 29, 30, 30, 30, 35, 36, 36, 36, 37, 39, 40, 41, 42, 45, 46, 46, 46, 47, 48};
        int n = 90;
        int[] expected = {-49, -45, -42, -41, -40, -39, -39, -39, -38, -36, -34, -34, -33, -33, -32, -31, -29, -28, -26, -26, -24, -21, -20, -20, -18, -16, -16, -14, -12, -11, -7, -6, -5, -4, -4, -3, -3, -2, -2, -1, 0, 0, 0, 2, 2, 6, 7, 7, 8, 10, 10, 13, 13, 15, 15, 16, 17, 17, 19, 19, 20, 20, 20, 21, 21, 22, 22, 24, 24, 25, 26, 27, 29, 30, 30, 30, 35, 36, 36, 36, 37, 39, 40, 41, 42, 45, 46, 46, 46, 47, 48};
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);
    }

}