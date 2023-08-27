package codeRandom.chapter05.part01;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 14:13
 **/
public class code02 {
    Queue<Integer> queue;
    public code02() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        while (size-- > 1) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
