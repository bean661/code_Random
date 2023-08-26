package codeRandom.chapter03.part01;

import javax.print.DocFlavor;
import java.util.HashSet;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 22:03
 **/
public class code03 {
    public static void main(String[] args) {
        code03 c = new code03();
//        System.out.println(c.isHappy(2));
        System.out.println(2/10);
    }
    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        int sum = 0;
        while (!hashSet.contains(n)) {
            hashSet.add(n);
            sum = 0;
            while (n > 0) {
                System.out.println(1);
                int temp = n % 10;
                sum +=  temp * temp;
                n = n / 10;
            }
            if (sum == 1) {
                return true;
            }
            n = sum;
            sum = 0;
        }
        return false;
    }
}
