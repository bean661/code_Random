package codeRandom.chapter04.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 12:44
 **/
public class code04 {
    public String reverseWords(String s) {
        StringBuilder sb = removeSpace(s);
        reverseString(sb,0,sb.length()-1);
        reverseEachWord(sb);
        return sb.toString();
    }

    private void reverseEachWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseString(sb, start, end - 1);
            start = end + 1;
            end = start + 1;
        }
    }


    public void reverseString(StringBuilder sb,int start,int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
    StringBuilder removeSpace(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (s.charAt(start) == ' ') start++;
        while (s.charAt(end) == ' ') end--;
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            if (start > 0 && s.charAt(start) == ' ' && s.charAt(start - 1) == ' ') {
                start++;
            }else {
                sb.append(s.charAt(start++));
            }
        }
        System.out.println(sb.toString());
        return sb;
    }
}
