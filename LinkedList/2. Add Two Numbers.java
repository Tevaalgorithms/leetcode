/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummyHead = new ListNode(0);
      ListNode  first = l1;
      ListNode  second = l2;
      ListNode  curr = dummyHead;  
      int carry = 0;  
      while(first != null || second != null) {
          
          int firstVal = (first != null) ? first.val : 0;
          
          int secondVal = (second != null) ? second.val : 0;
          
          int sum = firstVal + secondVal + carry;
          
          carry = sum / 10;
          
          curr.next = new ListNode(sum % 10);
          
          curr = curr.next;
          
          if((first != null)){
              first = first.next;
          }
          
          if(second != null){
               second = second.next;
          }
      }
      if(carry > 0){
          curr.next = new ListNode(carry);
      }
      return dummyHead.next;  
    }
}
