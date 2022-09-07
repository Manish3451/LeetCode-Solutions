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
    public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
            
        ListNode curr = head;
        ListNode prev = null;
        ListNode forward = null;;
        
        while(curr != null ){
            forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
}


// public void swap(Node Left,Node Right){
//     int leftdata = left.data;
//     left.data = right.data;
//     int rightdata = leftdata;
// }


// public Node getNodeAt(int idx){
//     Node curr = head;
    
//     for(int i = 0; i < idx; i++){
//         curr = curr.next;
//     }
//     return curr;
// }


// public void reverse() {
//     int left = 0; int right = size-1;
//     while(left < right){
//         Node leftNode = getNodeAt(left);
//         Node rightNode = getNodeAt(right);
        
//         swap(leftNode,rightNode);
//         left++; right--;
//     }
