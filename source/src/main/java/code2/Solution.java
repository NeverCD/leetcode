package main.java.code2;

/**
 * Created by duxf on 2017/7/14.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int resultFirstValue = l1.val + l2.val;
        ListNode result = new ListNode((resultFirstValue) % 10);

        int addToNext = (resultFirstValue >= 10) ? 1 : 0;
        ListNode lNext1 = l1.next;
        ListNode lNext2 = l2.next;
        ListNode resultCurrent = result;

        while (lNext1 != null || lNext2 != null) {

            int lNextValue1 = (lNext1 != null) ? lNext1.val : 0;
            int lNextValue2 = (lNext2 != null) ? lNext2.val : 0;
            int resultNextValue = lNextValue1 + lNextValue2 + addToNext;
            ListNode resultNext = new ListNode(resultNextValue % 10);

            addToNext = (resultNextValue >= 10) ? 1 : 0;

            if(lNext1 != null) {
                lNext1 = lNext1.next;
            } else {
                lNext1 = null;
            }
            if(lNext2 != null) {
                lNext2 = lNext2.next;
            } else {
                lNext2 = null;
            }

            resultCurrent.next = resultNext;
            resultCurrent = resultNext;
        }

        //对等长最后一对相加进位处理
        if(addToNext != 0) {
            ListNode resultLast = new ListNode(addToNext);
            resultCurrent.next = resultLast;
        }

        return result;
    }
}