package com.xzw.sortingsimple16;

import java.util.Arrays;

/**
 * @author maroon
 * @date 2023/3/30 14:14
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class ArrangeTheArrayToTheSmallestNumber {
}
class Solution {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, (x, y) -> (x + y).compareTo(y + x));
        StringBuffer res = new StringBuffer();
        for (String s : strs) {
            res.append(s);
        }
        return res.toString();
    }
}