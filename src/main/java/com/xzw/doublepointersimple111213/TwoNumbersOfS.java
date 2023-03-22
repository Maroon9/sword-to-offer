package com.xzw.doublepointersimple111213;

/**
 * @author maroon
 * @date 2023/3/21 23:29
 */
public class TwoNumbersOfS {
}
class Solution6 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                return new int[]{nums[left], nums[right]};
            }
            left = nums[left] + nums[right] < target ? left + 1 : left;
            right = nums[left] + nums[right] > target ? right - 1 : right;
        }
        return null;
    }
}