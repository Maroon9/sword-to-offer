package com.xzw.lookupalgorithmsimple4;

/**
 * @author maroon
 * @date 2023/3/12 14:17
 * 统计一个数字在排序数组中出现的次数。
 */
public class FindTheNmberInASortedArray1 {
    public static void main(String[] args) {

    }
}
class Solution4 {
    public int search(int[] nums, int target) {
        int count = 0;
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            }

            if (nums[mid] >= target) {
                right = mid;
            }
        }
        while (left < nums.length && nums[left++] == target) {
            count++;
        }
        return count;
    }
}
