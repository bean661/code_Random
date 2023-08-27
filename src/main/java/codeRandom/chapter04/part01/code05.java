package codeRandom.chapter04.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 13:30
 **/
public class code05 {
    public String reverseLeftWords(String s, int n) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        reverseString(sb, 0, n - 1);
        reverseString(sb, n, len - 1);
        reverseString(sb, 0, len - 1);
        return sb.toString();
    }

    public void reverseString(StringBuilder s, int start, int end) {
        while (start < end) {
            char temp = s.charAt(start);
            s.setCharAt(start, s.charAt(end));
            s.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
