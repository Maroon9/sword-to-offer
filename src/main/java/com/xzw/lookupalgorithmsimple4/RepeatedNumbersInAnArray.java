package com.xzw.lookupalgorithmsimple4;

import java.util.Arrays;

/**
 * @author maroon
 * @date 2023/3/12 14:13
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 */
public class RepeatedNumbersInAnArray {
    public static void main(String[] args) {

    }
}
class Solution3 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}