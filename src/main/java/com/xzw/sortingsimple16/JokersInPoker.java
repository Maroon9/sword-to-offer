package com.xzw.sortingsimple16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author maroon
 * @date 2023/3/30 14:36
 */
public class JokersInPoker {
    public static void main(String[] args) {
        //System.out.println(Solution2.isStraight(new int[]{1, 2, 3, 4, 5}));
        System.out.println(Solution21.isStraight(new int[]{11, 0, 9, 0, 0}));
    }
}
class Solution2 {
    public static boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>();
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) continue; // 跳过大小王
            max = Math.max(max, num); // 最大牌
            min = Math.min(min, num); // 最小牌
            if(repeat.contains(num)) return false; // 若有重复，提前返回 false
            repeat.add(num); // 添加此牌至 Set
        }
        return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
}
class Solution21 {
    public static boolean isStraight(int[] nums) {
        int joker = 0;
        Arrays.sort(nums); // 数组排序
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++; // 统计大小王数量
            else if(nums[i] == nums[i + 1]) return false; // 若有重复，提前返回 false
        }
        return nums[4] - nums[joker] < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
}