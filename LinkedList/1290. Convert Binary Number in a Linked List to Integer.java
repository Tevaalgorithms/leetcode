/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head == null) return 0;
        
        // Step 1: Reverse the list
        ListNode reversed = reverse(head);
        
        // Calculate the value
        int res = 0;
        int num = 0;
        while(reversed != null) {
            res += reversed.val * Math.pow(2, num);
            num++; 
            reversed = reversed.next;
        }
        return res;
    }
    
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode p = reverse(head.next);
        
        head.next.next = head;
        
        head.next = null;
        
        return p;
    }
}
