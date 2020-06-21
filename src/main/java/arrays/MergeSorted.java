package arrays;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.

Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]

 */
public class MergeSorted {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            if (n > 0) {
                int nums1Copy[] = nums1.clone();
                int lengthSum = m + n;
                int i = 0;
                int j = 0;
                int k = 0;
                while (k < lengthSum) {
                    if (n <= j) {
                        nums1[k] = nums1Copy[i];
                        i++;
                    } else if (m <= i) {
                        nums1[k] = nums2[j];
                        j++;
                    } else if (nums2[j] == nums1Copy[i]) {
                        nums1[k] = nums1Copy[i];
                        i++;
                        k++;
                        nums1[k] = nums2[j];
                        j++;
                    } else if (nums2[j] > nums1Copy[i]) {
                        if (i < m) {
                            nums1[k] = nums1Copy[i];
                            i++;
                        } else {
                            nums1[k] = nums2[j];
                            j++;
                        }
                    } else if (nums2[j] < nums1Copy[i] && j < n) {
                        if (j < n) {
                            nums1[k] = nums2[j];
                            j++;
                        } else {
                            nums1[k] = nums1Copy[i];
                            i++;
                        }
                    }
                    k++;
                }
            }
        }
    }
}
