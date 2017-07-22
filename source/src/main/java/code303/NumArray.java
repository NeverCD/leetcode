package main.java.code303;

/**
 * Created by duxf on 2017/7/22.
 * !!!Time Limit Exceeded
 */
public class NumArray {

    int[] data;

    public NumArray(int[] nums) {
        this.data = nums;
    }

    public int sumRange(int i, int j) {
        int sum = 0;
        for(int n = i; n <= j; n++) {
            sum = sum + this.data[n];
        }
        return sum;
    }
}