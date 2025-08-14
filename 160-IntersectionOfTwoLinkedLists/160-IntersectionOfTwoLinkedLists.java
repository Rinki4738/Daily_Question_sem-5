// Last updated: 8/14/2025, 3:47:34 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=tempB){
            if(tempA==null){
                tempA=headB;
            }
           else if(tempB==null){
            tempB=headA;
            }
            else{
                tempA=tempA.next;
                tempB=tempB.next;

            }

        }
        return tempA;

        
    }
}