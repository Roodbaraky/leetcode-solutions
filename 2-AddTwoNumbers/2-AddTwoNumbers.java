// Last updated: 19/06/2025, 09:11:55
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode current = result;
        int temp;
        int carry=0;
        while(l1!=null||l2!=null){
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            temp = val1 + val2 + carry;
            if(temp>9){
                carry = 1;
                temp = temp%10;
            }
            else{
                carry=0;
            }
           if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

    
            current.next= new ListNode(temp);
            current = current.next;
        }
        if(carry>0){
            current.next = new ListNode(carry);
        }

      return result.next;
    }
}