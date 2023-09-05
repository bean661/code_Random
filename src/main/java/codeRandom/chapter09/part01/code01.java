package codeRandom.chapter09.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 21:47
 **/
public class code01 {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
