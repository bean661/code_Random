package codeRandom.chapter03.part01;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 21:00
 **/
public class code01 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i), 1);
            }

        }
        for (int i = 0; i < t.length(); i++) {
            //判断是否存在 不存在返回false;
            if (!map.containsKey(t.charAt(i))){
                return false;
            }
            int val = map.get(t.charAt(i));
            //判断是否为0；
            if (val <= 0) {
                return false;
            }
            map.put(t.charAt(i),  val - 1);
        }
        return true;
    }
}
