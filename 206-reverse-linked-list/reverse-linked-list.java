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
        if(head==null || head.next==null)return head;

        //recursive until if condition stops it
        ListNode newnode=reverseList(head.next);

        //makes the head's next as head, making it a reversing 
        head.next.next=head;

        //now making the last node's next as null thus returning it as the next node again and again making it in reversing order which is declared in if condition
        head.next=null;

        return newnode;
    }
}