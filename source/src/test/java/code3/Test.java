package test.java.code3;

import main.java.code3.Solution3;


/**
 * Created by duxf on 2017/7/16.
 */
public class Test {
    public static void main(String[] args) {
        String s = "abcabcdd";
        Solution3 solution3 = new Solution3();
        System.out.println("length=" + solution3.lengthOfLongestSubstring(s));
    }
}