package codeRandom.chapter04.part01;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-08-27 11:56
 **/
public class code02 {


    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i+=2*k) {
            int start = i;
            int end = Math.min(start + k - 1, chars.length - 1);
            while (start < end) {
                chars[start] ^= chars[end];
                chars[end] ^= chars[start];
                chars[start] ^= chars[end];

                start++;
                end--;
            }
        }
        return new String(chars);
    }


    public String reverseStr1(String s, int k) {
        char[] str = s.toCharArray();
        int i = 0;
        while (i + 2 * k < str.length) {
            str = reverse(str, i, i+k-1);
            i += 2 * k;
        }
        int last = i-k;
        if (last < str.length) {
            str = reverse(str, i - 2*k, last);
        }else {
            str = reverse(str, i - 2 * k, str.length - 1);
        }
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < str.length; j++) {
            builder.append(str[j]);
        }

        return builder.toString();

    }

    char[] reverse(char[] str, int i, int j) {
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return str;
    }

}
