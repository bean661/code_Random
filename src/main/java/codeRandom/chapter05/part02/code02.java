package codeRandom.chapter05.part02;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 14:58
 **/
public class code02 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque.pop());
//        System.out.println(deque.pollLast());
        System.out.println(deque.peekLast());
        System.out.println(deque.peekFirst());
    }
    public String removeDuplicates(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (deque.isEmpty() || deque.peek() != ch) {
                deque.push(ch);
            }else {
                deque.poll();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.insert(0,deque.pop());
        }
        return sb.toString();

    }
}
