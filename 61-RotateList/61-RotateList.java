// Last updated: 8/14/2025, 3:48:46 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return head;
        }
        int i=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            i++;
        }
        temp.next=head;
        k=k%i;
        int t=i-k;
        ListNode temp2=head;
        while(t>1){
            temp2=temp2.next;
            t--;
        }
        head=temp2.next;
        temp2.next=null;
        return head;
        
    }
}