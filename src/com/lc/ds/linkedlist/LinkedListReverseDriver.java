package com.lc.ds.linkedlist;

/**
 * @author Vel
 * @date 05/04/23 : 08:05
 * Question link : https://leetcode.com/problems/reverse-linked-list/
 * Question name : Reverse Linked List
 * Question desc : Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class LinkedListReverseDriver {
    public static void main(String[] args) {

    }
}

class LinkedListReversalTool{
    public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode tempNext = current.next;
            current.next = previous;
            previous = current;
            current = tempNext; 
        }

        return null;
    }
}