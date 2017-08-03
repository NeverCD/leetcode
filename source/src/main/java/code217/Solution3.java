package main.java.code217;

import java.util.Arrays;

/**
 * Created by duxf on 2017/8/3.
 */
public class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
