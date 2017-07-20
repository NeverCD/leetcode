package test.java.code121;

import main.java.code121.Solution;

/**
 * Created by duxf on 2017/7/20.
 */
public class Test121 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int prices[] = {7,1,5,3,6,4};

        System.out.println("maxProfit=" + solution.maxProfit(prices));
    }
}
