package com.kaisnm.first100.f10;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author: create by jikang.zhou
 * @version: v1.0
 * @description: com.kaisnm.first100.f10
 * @date:2020/7/9
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */


public class Test2 {



    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.val : 0;
            int v2 = l2 != null ? l2.val : 0;
            int sum = v1 + v2 + carry;
            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail = tail.next = new ListNode(sum % 10);
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1= new ListNode(2);
        node1.next = new ListNode(4);
        node1.next.next = new ListNode(3);


        ListNode node2= new ListNode(5);
        node2.next = new ListNode(6);
        node2.next.next = new ListNode(4);

        ListNode listNode = addTwoNumbers(node1, node2);
        System.out.println(listNode.toString());
        ListNode test1= new ListNode(0);
        ListNode test2= new ListNode(0);
        ListNode testNode = addTwoNumbers(test1, test2);
        System.out.println(testNode.toString());


        ListNode a1= new ListNode(9);
        a1.next = new ListNode(9);
        a1.next.next = new ListNode(9);
        a1.next.next.next = new ListNode(9);
        a1.next.next.next.next= new ListNode(9);
        a1.next.next.next.next.next = new ListNode(9);
        a1.next.next.next.next.next.next = new ListNode(9);

        ListNode a2= new ListNode(9);
        a2.next = new ListNode(9);
        a2.next.next = new ListNode(9);
        a2.next.next.next = new ListNode(9);

        ListNode aNode = addTwoNumbers(a1, a2);
        System.out.println(aNode);
    }


//    /**
//     * l1  3 - 7 - 2 - null
//     * l2  6 - 8 - 9 - null
//     */
//    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode tmpNode = new ListNode(0);
//        ListNode p = l1, q = l2, cur = tmpNode;
//        int carry = 0;
//        while (p != null || q != null) {
//            int x = (p != null) ? p.val : 0;
//            int y = (q != null) ? q.val : 0;
//            int j = x + y + carry;
//            carry = j / 10;
//            cur.next = new ListNode(j);
//            cur = cur.next;
//            if (p != null) {
//                p = p.next;
//            }
//            if (q != null) {
//                q = q.next;
//            }
//        }
//        if (carry > 0) {
//            cur.next = new ListNode(carry);
//        }
//        return tmpNode.next;
//    }
//
//    public static void main(String[] args) {
//
//        //765
//        ListNode listNode = new ListNode(5);
//        listNode.next = new ListNode(6);
//        listNode.next.next = new ListNode(7);
//
//        //321
//        ListNode listNode2 = new ListNode(1);
//        listNode2.next = new ListNode(2);
//        listNode2.next.next = new ListNode(3);
//
//        System.out.println(addTwoNumbers(listNode, listNode2));
//
//
//    }

}


//class ListNode {
//    int val;
//    ListNode next;
//
//    ListNode(int x) {
//        val = x;
//    }
//
//    @Override
//    public String toString() {
//        String ms = "" + val;
//        ListNode node = this;
//        while ((node = node.next) != null) {
//            ms += ":" + val;
//        }
//        return ms;
//    }
//}