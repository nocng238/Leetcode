package LinkedList;

import java.io.*;
import java.util.*;

public class ListNode {
    private int val;
    private ListNode next;

    public ListNode(int data) {
        this.val = data;
    }

    public void setData(int data) {
        this.val = data;
    }

    public int getData() {
        return val;
    }

    public void setNext(ListNode node) {
        this.next = node;
    }

    public ListNode getNext() {
        return this.next;
    }

    //206
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 6};
        int[] palindrome = {1, 2, 2, 1};
        ListNode palindromeList = createLinkedList(arr1);
        //System.out.println(isPalindrome(palindromeList));
        ListNode l1 = createLinkedList(arr1);
        ListNode l2 = createLinkedList(arr2);
        ListNode mergeList = mergeTwoLists(l1, l2);
        //printLinkedList(mergeList);
        pairSum(l1);
    }

    static public ListNode createLinkedList(int[] arr) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        for (int i = 0; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head.next;
    }

    static public int getLength(ListNode head) {
        ListNode current = head;
        int i = 0;
        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    static public void printLinkedList(ListNode node) {
        ListNode current = node;
        while (current != null) {
            System.out.print(current.val + "-->");
            current = current.next;
        }
    }

    static public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    static public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode preHead = new ListNode(-1);
        ListNode current = preHead;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next = list1 == null ? list2 : list1;
        return preHead.next;
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode current = head;
        List<Integer> ls = new ArrayList<>();
        while (current != null) {
            ls.add(current.val);
            current = current.next;
        }
        int length = ls.size();
        for (int i = 0; i < length / 2; i++) {
            if (ls.get(i) != ls.get(length - 1 - i)) return false;
        }
        return true;
    }

    static public ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;

            }
        }

        return head;
    }

    static public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    static public ListNode middleNode(ListNode head) {
        ListNode fastRunner = head;
        ListNode slowRunner = head;
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        return slowRunner;
    }

    static public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //visual explanation
        //https://leetcode.com/problems/intersection-of-two-linked-lists/solutions/2116221/visual-explanation-one-pass-java/
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != currentB) {
            currentA = currentA == null ? headB : currentA.next;
            currentB = currentB == null ? headA : currentB.next;
        }
        return currentA;
    }

    static public void reorderList(ListNode head) {
        ListNode runner = head;
        List<ListNode> ls = new ArrayList<>();
        while (runner != null) {
            ls.add(runner);
            runner = runner.next;
        }
        runner = head;
        int length = ls.size();
        int l = 1;
        int r = 1;
        for (int i = 0; i < length - 1; i++) {
            if (i % 2 == 0) {
                runner.next = ls.get(length - r);
                r++;
            } else {
                runner.next = ls.get(l);
                l++;
            }
            runner = runner.next;
        }
        runner.next = null;
    }

    static public int pairSum(ListNode head) {
        int res = 0;
        // if head will be null or head.next will be null simply return ;
        if (head == null || head.next == null) return 0;
        //find middle node
        ListNode fastRunner = head;
        ListNode slowRunner = head;
        while (fastRunner != null && fastRunner.next != null) {
            slowRunner = slowRunner.next;
            fastRunner = fastRunner.next.next;
        }
        // breaking the list from the middle
        ListNode secondHalfReversed = reverseList(slowRunner);
        slowRunner = null;
        ListNode firstHalf = head;
        while (secondHalfReversed != null) {
            res = Math.max((secondHalfReversed.val + firstHalf.val), res);
            secondHalfReversed = secondHalfReversed.next;
            firstHalf = firstHalf.next;
        }
        return res;
    }
}

