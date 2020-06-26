package arrays;

public class MergeSorted3 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int pointer = m + n - 1;
            m--;
            n--;
            while (pointer >= 0 && n >= 0 && m >= 0) {
                if (nums1[m] > nums2[n]) {
                    nums1[pointer--] = nums1[m--];
                } else {
                    nums1[pointer--] = nums2[n--];
                }
            }
            while (pointer >= 0) {
                if (m >= 0) {
                    nums1[pointer--] = nums1[m--];
                } else {
                    nums1[pointer--] = nums2[n--];
                }
            }

        }
    }
}
