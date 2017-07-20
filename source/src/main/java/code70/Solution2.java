package main.java.code70;

/**
 * Created by duxf on 2017/7/20.
 */
public class Solution2 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        int result = 0;
        int climbNSub2 = 1;
        int climbNSub1 = 2;

        for (int i = 3; i <= n; i++ ) {
            result = climbNSub1 + climbNSub2;
            climbNSub2 = climbNSub1;
            climbNSub1 = result;
        }

        return result;
    }
}
