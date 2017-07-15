package main.java.code3;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by duxf on 2017/7/15.
 * !!!Time Limit Exceeded O(n^3)
 */
public class Solution2 {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (allUnique(s, i, j)) {
                    result = Math.max(result, j - i);
                }
            }
        }
        return result;
    }

    private boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                return false;
            }

            set.add(ch);
        }
        return true;
    }
}