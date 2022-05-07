package com.changeingconst;// *
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }

import com.changeingconst.ListNode;

class TwoSum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        int carry=0;
        ListNode temp;
        ListNode  preNode=l3;
        l3.val=-1;
        while(l1!=null && l2!=null)
        {
            if(preNode.val!=-1)
            {
                temp= new ListNode();
                preNode.next=temp;
            }
            else
            {
                temp=preNode;
            }


            temp.val=carry+l1.val+l2.val;
            temp.val=temp.val%10;
            carry=(int)(carry+l1.val+l2.val)/10;

            l1=l1.next;
            l2=l2.next;
            preNode=temp;
        }
        while(l1!=null)
        {
            temp= new ListNode();
            preNode.next=temp;
            temp.val=carry+l1.val;
            temp.val=temp.val%10;
            carry=(int)(carry+l1.val)/10;

            l1=l1.next;
            preNode=temp;
        }
        while(l2!=null)
        {

            temp= new ListNode();
            preNode.next=temp;
            temp.val=carry+l2.val;
            temp.val=temp.val%10;
            carry=(int)(carry+l2.val)/10;

            l2=l2.next;
            preNode=temp;
        }
        if(carry!=0)
        {
            temp= new ListNode();
            preNode.next=temp;
            temp.val=carry;
        }
        return l3;
    }
}