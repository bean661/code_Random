package codeRandom.chapter03.part02;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 23:07
 **/
public class code02 {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (arr[ransomNote.charAt(i) - 'a'] == 0) {
                return false;
            }else {
                arr[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }
}
