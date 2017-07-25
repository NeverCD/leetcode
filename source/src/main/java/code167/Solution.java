package main.java.code167;

/**
 * Created by duxf on 2017/7/25.
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        while (numbers[low] + numbers[high] != target) {
            if (numbers[low] + numbers[high] < target) {
                low++;
            } else {
                high--;
            }
        }
        int[] result = {low + 1, high + 1};
        return result;
    }
}
