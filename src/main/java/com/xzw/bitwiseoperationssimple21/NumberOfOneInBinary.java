package com.xzw.bitwiseoperationssimple21;

/**
 * @author maroon
 * @date 2023/4/8 16:28
 */
public class NumberOfOneInBinary {
    public static void main(String[] args) {
        System.out.println(Solution.hammingWeight(00000000000000000000000000001011));
    }
}
class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}