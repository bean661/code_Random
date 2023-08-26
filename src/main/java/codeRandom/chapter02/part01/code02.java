package codeRandom.chapter02.part01;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 14:02
 **/
public class code02 {
    int size;
    ListNode head;
    public code02() {
        size = 0;
        head = new ListNode(-1);
    }

    public int get(int index) {
        if (index >= size || index < 0) {
            return -1;
        }
        ListNode cur = head;
        for (int i = 0; i <= index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        if ( index > size) {
            return;
        }

        if (index < 0) {
            index = 0;
        }

        size++;


        //找到要插入的前驱节点
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre =pre.next;
        }

        ListNode add = new ListNode(val);
        add.next = pre.next;
        pre.next = add;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        //找到要删除的前驱节点
        size--;
        ListNode pre = head;
        for (int i = 0; i < index; i++) {
            pre = pre.next;
        }
        pre.next = pre.next.next;
    }
}
