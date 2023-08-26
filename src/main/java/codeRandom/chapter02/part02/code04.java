package codeRandom.chapter02.part02;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 20:50
 **/
public class code04 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode index1 = fast;
                ListNode index2 = head;
                while (index2 != index1) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index2;
            }
        }
        return null;
    }
}
