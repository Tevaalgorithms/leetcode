/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // [1, 2]
    public boolean isPalindrome(ListNode head) {
        // this for checking one element or null
        if(head == null || head.next == null) {
            return true;
        }
        
        // Calculate the length of the linkedlist
        ListNode curr = head;         
        int len = 0;
        
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        
        curr = head;          
        
        int mid = len / 2;
        
        while(mid > 0) {
            mid--;
            curr = curr.next;
        }
        
        ListNode secondHalf = curr;
              
        // Reverse the second half
        ListNode reversedList = reverseLinkedList(secondHalf);
        
        // Now compare the first half and second half      
        return compareLinkedList(head, reversedList);        
    }
    
    private ListNode reverseLinkedList(ListNode secondHalf) {
        ListNode pre = null;
        ListNode current = secondHalf;
        ListNode next = null;
        
        while(current != null)
        {
            next= current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        
        return pre;
    }
    
    private boolean compareLinkedList(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) {
            return false;
        }
        
        while(l2 != null) {
           if(l1.val != l2.val) {
               return false;
           }
            l1 = l1.next;
            l2 = l2.next;
        }
        
        return true;
    }
    
}
