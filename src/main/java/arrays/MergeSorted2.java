package arrays;

import java.util.PriorityQueue;

public class MergeSorted2 {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            mergeSortedArrays(nums1, m, nums2, n);
        }
    }

    private void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) {
            PriorityQueue<Integer> minHeap = new PriorityQueue<>(2);
            int i = 0;
            int j = 0;
            int k = 0;
            int[] nums1Copy = nums1.clone();
            while (i < m + n) {
                if (j < m) {
                    minHeap.offer(nums1Copy[j]);
                }
                if (k < n) {
                    minHeap.offer(nums2[k]);
                }
                if (!minHeap.isEmpty()) {
                    nums1[i] = minHeap.poll();
                } else {
                    break;
                }
                if (j < m && nums1[i] == nums1Copy[j]) {
                    j++;
                } else if (k < n && nums1[i] == nums2[k]) {
                    k++;
                }
                i++;
            }
        }
    }
}
