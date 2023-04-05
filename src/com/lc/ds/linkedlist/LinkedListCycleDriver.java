package com.lc.ds.linkedlist;

/**
 * @author Vel
 * @date 05/04/23 : 07:43
 * Question link : https://leetcode.com/problems/linked-list-cycle/
 * Question name : LinkedList cycle name
 * Question desc : Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *
 * There is a cycle in a linked list if there is some node in the list that can be reached again
 * by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to.
 * Note that pos is not passed as a parameter.
 *
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycleDriver {
    public static void main(String[] args) {

    }
}

class LinkedListCycleFinder {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}