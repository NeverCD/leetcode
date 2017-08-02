package main.java.code461;

/**
 * Created by duxf on 2017/8/2.
 */
public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
