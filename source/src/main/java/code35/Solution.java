package main.java.code35;

import java.util.Arrays;

/**
 * Created by duxf on 2017/7/18.
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return (nums[0] >= target) ? 0 : 1;
        }

        if (nums.length == 2) {
            if (nums[0] >= target) {
                return 0;
            } else if (nums[0] < target && nums[1] >= target) {
                return 1;
            } else {
                return 2;
            }
        }

        int i = 0;
        int n = (nums.length + 1) / 2 - 1;

        if (nums[n] == target) {
            i = i + n;
        }else if (nums[n] > target) {
            i = i + searchInsert(Arrays.copyOfRange(nums, 0, n), target);
        } else {
            i = i + n + 1 + searchInsert(Arrays.copyOfRange(nums, n + 1, nums.length), target);
        }
        return i;
    }
}