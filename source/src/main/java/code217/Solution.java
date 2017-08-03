package main.java.code217;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by duxf on 2017/8/3.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(m.containsKey(nums[i])) {
                return true;
            }
            m.put(nums[i], i);
        }
        return false;
    }
}