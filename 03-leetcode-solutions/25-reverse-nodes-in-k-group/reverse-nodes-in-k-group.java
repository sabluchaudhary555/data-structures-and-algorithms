/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Check if we have k nodes to reverse
        ListNode current = head;
        int count = 0;
        
        // Count k nodes
        while (current != null && count < k) {
            current = current.next;
            count++;
        }
        
        // If we have k nodes, reverse them
        if (count == k) {
            // Reverse k nodes
            ListNode reversedHead = reverseLinkedList(head, k);
            
            // head is now the last node of the reversed group
            // Recursively reverse the next k-group
            head.next = reverseKGroup(current, k);
            
            return reversedHead;
        }
        
        // If less than k nodes, return as is
        return head;
    }
    
    // Helper function to reverse first k nodes
    private ListNode reverseLinkedList(ListNode head, int k) {
        ListNode prev = null;
        ListNode current = head;
        
        while (k > 0) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            k--;
        }
        
        return prev;
    }
}