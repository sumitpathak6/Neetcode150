 class ListNode
{
    int val;
   ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode dummy=null; //making the dummy node
//         while(head!=null) //!Iterating till the end of the linkedlist
//         {
//             ListNode next = head.next; //!poining the next node to the next of head node
//             head.next=dummy;//!breaking the link of the head node
//             dummy=head; //!moving the dummy node forward
//             head=next; //!iterating the head node
//         }
//         return dummy; //!FINALLY THE DUMMY NODE POINTS TO THE HEAD OF THE REVERESED LINKED LIST
//     }
// }

//! 1->2->3->4->5->NULL
//! ->
//! 5->4->3->2->1->NULL

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev=null;
        while(curr!=null)
        {
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}