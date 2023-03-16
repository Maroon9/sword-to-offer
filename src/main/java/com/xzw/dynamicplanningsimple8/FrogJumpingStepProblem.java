package com.xzw.dynamicplanningsimple8;

/**
 * @author maroon
 * @date 2023/3/16 15:59
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 *
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 */
public class FrogJumpingStepProblem {

}
class Solution3 {
    public int numWays(int n) {
        if (n < 2) return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i -2];
            dp[i] %= 1000000007;
        }
        return dp[n];
    }
}