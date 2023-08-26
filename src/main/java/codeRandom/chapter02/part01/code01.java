package codeRandom.chapter02.part01;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 13:30
 **/


class ListNode {
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
}

public class code01 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode newHead = dummy;
        while (newHead.next != null) {
            if (newHead.next.val == val) {
                newHead.next = newHead.next.next;
            }else{

                newHead = newHead.next;
            }
        }
        return dummy.next;
    }
}
