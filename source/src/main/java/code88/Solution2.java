package main.java.code88;

/**
 * Created by duxf on 2017/7/24.
 */
public class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        for(int k= m + n - 1; k >= 0; k--) {
            if(i == -1 && j == -1) break;
            if(i == -1 && j > -1) {
                nums1[k] = nums2[j];
                j--;
                continue;
            }
            if(j == -1 && i > -1) {
                nums1[k] = nums1[i];
                i--;
                continue;
            }

            if(nums1[i] <= nums2[j]) {
                nums1[k] = nums2[j];
                j--;
            } else {
                nums1[k] = nums1[i];
                i--;
            }
        }
    }
}