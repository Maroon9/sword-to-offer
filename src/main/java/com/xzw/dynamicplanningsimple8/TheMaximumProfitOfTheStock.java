package com.xzw.dynamicplanningsimple8;

/**
 * @author maroon
 * @date 2023/3/16 16:20
 * 假设把某股票的价格按照时间先后顺序存储在数组中，请问买卖该股票一次可能获得的最大利润是多少？
 */
public class TheMaximumProfitOfTheStock {
}
class Solution4 {
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for(int price : prices) {
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
}