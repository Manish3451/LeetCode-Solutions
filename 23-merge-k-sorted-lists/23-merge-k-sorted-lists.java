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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        return mergeKlist(lists,0,lists.length-1);
    }
    public static ListNode mergeKlist(ListNode list[],int si,int ei){
        if(si==ei){
            return list[si];
        }
        int mid = (si+ei)/2;
        
        ListNode l1 = mergeKlist(list,si,mid);
        ListNode l2 = mergeKlist(list,mid+1,ei);
        return merge2list(l1,l2);
    }
    public static ListNode merge2list(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy, tail = dummy;
        
        while(l1 !=null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                l1 =l1.next;
            }
            else{
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        if(l1 != null) tail.next = l1;
        else tail.next = l2;
        return dummy.next;
    }
}