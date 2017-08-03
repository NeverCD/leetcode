package main.java.code217;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by duxf on 2017/8/3.
 */
public class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (s.contains(nums[i])) {
                return true;
            }
            s.add(nums[i]);
        }
        return false;
    }
}
