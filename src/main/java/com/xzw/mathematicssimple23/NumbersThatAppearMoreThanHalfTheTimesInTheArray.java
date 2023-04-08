package com.xzw.mathematicssimple23;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maroon
 * @date 2023/4/8 16:51
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */
public class NumbersThatAppearMoreThanHalfTheTimesInTheArray {
    public static void main(String[] args) {
        System.out.println(Solution.majorityElement(new int[]{1, 2, 3, 2, 2, 2, 5, 4, 2}));
    }
}
class Solution {
    public static int majorityElement(int[] nums) {
        int x = 0, votes = 0, count = 0;
        for(int num : nums){
            if(votes == 0) x = num;
            votes += num == x ? 1 : -1;
        }
        // 验证 x 是否为众数
        for(int num : nums)
            if(num == x) count++;
        return count > nums.length / 2 ? x : 0; // 当无众数时返回 0
    }
}

class Solution2 {
    public int majorityElement(int[] nums) {
        int len = nums.length;
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > (len / 2)) {
                res = num;
                break;
            }
        }
        return res;
    }
}