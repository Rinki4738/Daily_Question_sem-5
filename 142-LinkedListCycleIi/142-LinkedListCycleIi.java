// Last updated: 8/14/2025, 3:47:46 PM
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
        ListNode meet=new ListNode();
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                meet=slow;
                break;
            }
        }System.out.println(meet.val);
        if(fast!=slow){
            return null;
        }
        if(meet==head||head==null){
            return head;
        }
        fast=head;
        System.out.println(fast.val);
        while(fast!=meet){
            fast=fast.next;
            meet=meet.next;
            if(fast==meet){
                return fast;
            }
        }
        return meet;
        
    }
}