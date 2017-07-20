package main.java.code70;

/**
 * Created by duxf on 2017/7/20.
 * !!!	Time Limit Exceeded
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        n = climbStairs(n-1) + climbStairs( n-2) + 3;

        return n;
    }
}