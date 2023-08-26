package codeRandom.chapter02.part01;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 19:29
 **/
public class code03 {
    //递归
    public ListNode reverseList(ListNode head) {
        return reverse(null, head);



    }

    ListNode reverse(ListNode prev, ListNode cur) {
        if (cur == null) {
            return prev;
        }

        ListNode temp = cur.next;
        cur.next = prev;
        prev = cur;

        return reverse(cur, temp);
    }

    //从前往后
    public ListNode reverseList1(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }
}
