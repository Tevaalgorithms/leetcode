/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null) {
            return null;
        }
        
        ListNode result = head;
        
        ListNode ptr1 = head;
        
        ListNode ptr2 = head.next;
        
        ListNode connectNode = head.next;
        
        while(ptr1 != null && ptr2 != null){
            ListNode t = ptr2.next;
            if(t == null) {
                break;
            }
            ptr1.next = ptr2.next;
            ptr1 = ptr1.next;
            
            ptr2.next = ptr1.next;
            ptr2 = ptr2.next;
        }
        
        ptr1.next = connectNode;
        
        return result;
    }
}
