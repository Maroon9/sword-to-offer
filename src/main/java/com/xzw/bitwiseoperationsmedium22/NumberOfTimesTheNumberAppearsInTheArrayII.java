package com.xzw.bitwiseoperationsmedium22;

/**
 * @author maroon
 * @date 2023/4/8 16:47
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 */
public class NumberOfTimesTheNumberAppearsInTheArrayII {
}
class Solution2 {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int num : nums){
            ones = ones ^ num & ~twos;
            twos = twos ^ num & ~ones;
        }
        return ones;
    }
}
