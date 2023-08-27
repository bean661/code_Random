package codeRandom.chapter04.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 10:40
 **/
public class code01 {
    public void reverseString(char[] s) {
        int len = s.length;
        int i = 0;
        while (i < len / 2) {
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
            i++;
        }
        return;
    }
}
