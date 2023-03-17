package com.xzw.dynamicplanningmedium910;

/**
 * @author maroon
 * @date 2023/3/17 12:04
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 *
 */
public class MaximumSumOfConsecutiveSubarrays {
    public static void main(String[] args) {
        System.out.println(Solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1] + nums[i] ,nums[i]);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}