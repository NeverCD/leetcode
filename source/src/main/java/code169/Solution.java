package main.java.code169;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by duxf on 2017/7/25.
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int n : nums) {
            if (m.containsKey(n)) {
                if (m.get(n) + 1 > nums.length / 2) return n;
                m.put(n, m.get(n) + 1);
            } else {
                if (1 > nums.length / 2) return n;
                m.put(n, 1);
            }
        }
        return 0;
    }

    // Sorting
    public int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    // Moore voting algorithm 最大投票算法
    public int majorityElement2(int[] nums) {
        int count=0, ret = 0;
        for (int num: nums) {
            if (count==0)
                ret = num;
            if (num!=ret)
                count--;
            else
                count++;
        }
        return ret;
    }
}