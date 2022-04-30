package com.luion.两数相加;

public class Add {


}

  // Definition for singly-linked list.
  public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
    ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       ListNode dummpy =  new ListNode(-1);
       ListNode p2 = l2;
       int flag = 0;

       while(p1!=null||p2!=null){
           int target = flag;

            if(p1!=null){
               target+=p1.val;
                p1 = p1.next;
           }

            if(p2!=null){
               target+=p2.val;
                p2 = p2.next;
            }

         if(target>9){
                target-=10;
               flag=1;
           }else{
              flag=0;
           }
        p.next = new ListNode(target);
            p = p.next;
        }

        if (flag==1){
            p.next = new ListNode(1);
                 }
        return dummpy.next;
   }
}