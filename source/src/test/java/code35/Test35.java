package test.java.code35;

import main.java.code35.Solution;

/**
 * Created by duxf on 2017/7/18.
 */
public class Test35 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int nums[] = {1, 3, 5};
        int target = 3;

        System.out.println("place=" + solution.searchInsert(nums, target));
    }
}
