package com.xzw.dynamicplanningmedium910;

/**
 * @author maroon
 * @date 2023/3/17 18:46
 * 在一个 m*n 的棋盘的每一格都放有一个礼物，每个礼物都有一定的价值（价值大于 0）。
 * 你可以从棋盘的左上角开始拿格子里的礼物，并每次向右或者向下移动一格、直到到达棋盘的右下角。
 * 给定一个棋盘及其上面的礼物的价值，请计算你最多能拿到多少价值的礼物？
 *
 */
public class TheGreatestValueOfTheGift {
}
class Solution2 {
    public int maxValue(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
                }
                if (j > 0) {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i][j]);
                }
                dp[i][j] += grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}