package main.java.code303;

/**
 * Created by duxf on 2017/7/22.
 */
public class NumArray2 {

    int[] sum;

    public NumArray2(int[] nums) {
        sum = new int[nums.length];
        sum[0] = nums[0];
        for (int n = 1; n < nums.length; n++) {
            sum[n] = nums[n] + sum[n - 1];
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0) {
            return sum[j];
        }
        return sum[j] - sum[i - 1];
    }
}