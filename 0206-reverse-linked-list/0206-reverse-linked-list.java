
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ans=null;
        ListNode temp=head;
        while(temp !=null)
        {
            ListNode newNode=temp.next;
            temp.next=ans;
            ans=temp;
            temp=newNode;
        }
        return ans;
    }
}