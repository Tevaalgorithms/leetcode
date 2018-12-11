/*
Add Two Numbers
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode temp = new ListNode(0);
        ListNode p1 = l1, p2 = l2, curr = temp;
        int carry  = 0;
        while(p1 != null || p2 != null)
        {
            //Get the list node data values
            int x = (p1 != null) ? p1.val : 0;
            int y = (p2 != null) ? p2.val : 0;
            
            // Add the sum value
            int sum = x + y + carry;
            
            // Update the carry value
            carry = sum / 10;
            
            // Assing the value of mode to current next node
            curr.next = new ListNode(sum % 10);
            
            // Move the list item to next
            curr = curr.next;
            if(p1 != null) p1 = p1.next;
            if(p2 != null) p2 = p2.next;           
            
        }
        if (carry > 0)
        {
            curr.next = new ListNode(carry);
        }
        return temp.next;
    }
}
