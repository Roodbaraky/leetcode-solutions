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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //iterate thru both lists while next is not null
        //if current value is less than other lists current value -> next until next >= other list
        //insert other list as next
        ListNode newList = new ListNode(0);
        ListNode preHead = newList;
        while(list1!=null && list2!=null){

            if(list1.val>list2.val){
                preHead.next=list2;
                list2 = list2.next;
            }
            else{
             preHead.next = list1;
             list1=list1.next;
            }
            preHead = preHead.next;     
    }
    preHead.next = list1==null?list2:list1;
    return newList.next;
}
}