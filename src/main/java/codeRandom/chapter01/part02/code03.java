package codeRandom.chapter01.part02;

/**
 * @program: codeRandom
 * @description:
 * @author: Bean
 * @create: 2023-08-26 13:06
 **/
public class code03 {
    public int[][] generateMatrix(int n) {

        int loop = 0;
        int i,j;
        int count = 1;
        int[][] res = new int[n][n];
        int start = 0;
        while (loop++ <= n/2){//判断边界 loop从1开始
            // 模拟上侧 从左到右
            for (j = start; j < n-loop ; j++) {
                res[start][j] = count++;
            }

            // 模拟右侧 从上到下
            for (i = start; i < n - loop; i++) {
                res[i][j] = count++;
            }

            //模拟下测 从右到左
            for (; j >= loop; j--) {
                res[i][j] = count++;
            }

            //模拟左侧 从下到上
            for (; i >= loop; i--) {
                res[i][j] = count++;
            }
            start++;
        }

        if (n % 2 == 1) {
            res[start][start] = count;
        }
        return res;
    }

}
