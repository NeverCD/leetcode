package main.java.code3;

/**
 * Created by duxf on 2017/7/15.
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int n = s.length();
        int[] chMap = new int[256]; //ASCII映射位

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (chMap[s.charAt(j)] == 0) {
                    chMap[s.charAt(j)] = 1;
                    result = Math.max(result, j - i + 1);
                }else{
                    break;
                }
            }
            //复原i位置的flag
            chMap[s.charAt(i)] = 0;
        }
        return result;
    }
}