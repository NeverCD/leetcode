package main.java.code118;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by duxf on 2017/7/24.
 */
public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> l = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            l.add(0, 1);
            for (int j = 1; j < l.size() - 1; j++) {
                l.set(j, l.get(j) + l.get(j + 1));
            }
            result.add(new ArrayList<Integer>(l));
        }
        return result;
    }
}