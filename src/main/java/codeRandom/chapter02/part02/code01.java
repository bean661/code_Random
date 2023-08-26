package codeRandom.chapter02.part02;


/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 19:54
 **/
public class code01 {
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




    public ListNode swapPairs(ListNode head) {
        // 退出操作
        if (head == null || head.next == null) {
            return head;
        }

        //获取当前节点的下一个节点
        ListNode next = head.next;
        //进行递归
        ListNode newNode = swapPairs(next.next);

        head.next = newNode;
        next.next = head;

        return next;


    }
    public ListNode swapPairs1(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode temp = null;
        ListNode first = null;
        ListNode second = null;

        while (cur.next != null && cur.next != null) {

        }
        return dummy.next;
    }
}
