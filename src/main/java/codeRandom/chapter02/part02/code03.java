package codeRandom.chapter02.part02;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 20:30
 **/
public class code03 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode dummyHeadA = headA;
        ListNode dummyHeadB = headB;

        int lenA = 0;
        int lenB = 0;
        while (headA != null) {
            headA  = headA.next;
            lenA++;
        }
        while (headB != null) {
            headB  = headB.next;
            lenB++;
        }
        int len = lenA - lenB;
        while (len > 0) {
            dummyHeadA = dummyHeadA.next;
            len--;
        }
        while (len < 0) {
            dummyHeadB = dummyHeadB.next;
            len++;
        }

        while (dummyHeadA != null || dummyHeadB != null) {
            if (dummyHeadA == dummyHeadB) {
                return dummyHeadB;
            }else {
                dummyHeadB = dummyHeadB.next;
                dummyHeadA = dummyHeadA.next;
            }
        }

        return null;

    }
}
