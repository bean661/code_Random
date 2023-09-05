package codeRandom.chapter08.part04;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-05 16:50
 **/
public class code01 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                }else {
                    return false;
                }
            }else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 2) {
                    five -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
