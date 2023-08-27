package codeRandom.chapter04.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 12:33
 **/
public class code03 {
    public String replaceSpace(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count += 2;
            }
        }
        char[] str = new char[s.length() + count];
        int j = str.length-1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                str[j--] = '0';
                str[j--] = '2';
                str[j--] = '%';
            }else {
                str[j--] = s.charAt(i);
            }
        }
        return new String(str);
    }
}
