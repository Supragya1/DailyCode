// https://leetcode.com/problems/median-of-two-sorted-arrays/

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, k =0;
        int[] arr = new int[n + m];

        for (int i = 0; i < n; i++) {
            arr[i] = nums1[i];
        }
        for (int i = 0; i < m; i++) {
            arr[i + n] = nums2[i];
        }
        Arrays.sort(arr);
        int size = arr.length;

        if (size % 2 != 0) {
            return (double)arr[size/2];
        }
        else {
            int m1 = arr[size/2];
            int m2 = arr[size/2 - 1];
            return (double)(m1 + m2)/2.0;
        }
    }
}