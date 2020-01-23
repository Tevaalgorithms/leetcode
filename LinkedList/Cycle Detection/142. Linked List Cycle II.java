/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode result = null;
        if(head == null) {
            return result;
        }        
        result = helper(head);
        return result;
    }
    
    private ListNode helper(ListNode head){
        if(head == null) return null;
        
        boolean detectCycle = false; 
        
        // Step 1: Detect cycle 
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while(fastPtr.next != null && fastPtr.next.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr) {
                detectCycle = true;
                break;
            }
        }
        
        if(!detectCycle) {
            return null;
        }
        
        // Now I need to start either fastPtr or slowPtr from the place where they meet
        // I need to move one poiter to head and the second one from the place where they meet. 
        // Now, when they meet again, that's the place the intrsection is happening 
        if(fastPtr == slowPtr) {
            slowPtr = head;
            while(fastPtr != slowPtr) {
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next;                
            }
            return slowPtr;
        }
        return null;
    }
}
