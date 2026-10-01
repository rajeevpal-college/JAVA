/*

1access kese krtey h element ko ll m ,array ki trh ,ya pointer k use krkey next next ka next like this??
2== operator use kre g then if satisfy then next wale element ko remove ??
3 line ka mtb public ListNode deleteDuplicates(ListNode head)
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr=head;
        // for(int i=0,i<deleteDuplicates.length(),i++)
        while (head!=null&&head.next!=null){
    //    if( head.next==head)
    if( head.next.val==head.val){
        head.next=head.next.next;
       }
     else head =head.next;  
        }

     return curr;   
    }
}