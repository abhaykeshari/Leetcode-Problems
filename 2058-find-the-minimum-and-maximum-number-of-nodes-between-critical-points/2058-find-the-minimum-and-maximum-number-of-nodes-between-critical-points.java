/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int first = -1;       // first critical point
        int prevCritical = -1; // previous critical point
        int min = Integer.MAX_VALUE;
        int index = 1;

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null && curr.next != null) {

            // Check whether curr is a critical point
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                // First critical point
                if (first == -1) {
                    first = index;
                }

                // We already have a previous critical point
                if (prevCritical != -1) {
                    min = Math.min(min, index - prevCritical);
                }

                prevCritical = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        // Less than 2 critical points
        if (first == prevCritical) {
            return new int[]{-1, -1};
        }

        // Maximum distance = last critical - first critical
        int max = prevCritical - first;

        return new int[]{min, max};
    }
}