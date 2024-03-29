package codeRandom.chapter09.part13;

/**
 * @program: code_Random
 * @description:
 * @author: Bean
 * @create: 2023-09-07 09:36
 **/
public class code04 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,2,1};
        int[] nums2 = new int[]{3,2,1,4,7};
        findLength(nums1, nums2);
    }
    public static int findLength(int[] nums1, int[] nums2) {
        int result = 0;
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                }
            }
        }
//        for (int[] ints : dp) {
//            System.out.println();
//            for (int anInt : ints) {
//                System.out.print(anInt);
//            }
//        }
        return result;
    }
}
