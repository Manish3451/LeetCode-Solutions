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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next == null){
            return true;
        }
        
        //find the middle of node 
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null && fast != null ){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        //Reverse second Part
        ListNode curr = slow.next;
        ListNode prev = null;
        
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            }
        
        fast = prev;
        slow = head;
        
        while(slow != null && fast != null){
            if(slow.val != fast.val){
                return false;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return true;
        
        
        
        
    }
}