package test.java.code303;

import main.java.code303.NumArray2;

/**
 * Created by duxf on 2017/7/22.
 */
public class Test303 {
    public static void main(String[] args) {
        int nums[] = {-2, 0, 3, -5, 2, -1};
        NumArray2 obj = new NumArray2(nums);
        int param_1 = obj.sumRange(2, 5);
        System.out.println("param_1 = [" + param_1 + "]");
    }
}
