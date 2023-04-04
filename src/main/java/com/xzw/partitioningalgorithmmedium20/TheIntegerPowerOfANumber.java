package com.xzw.partitioningalgorithmmedium20;

/**
 * @author maroon
 * @date 2023/4/4 14:22
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。不得使用库函数，同时不需要考虑大数问题。
 */
public class TheIntegerPowerOfANumber {
    public static void main(String[] args) {
        System.out.println(Solution2.myPow(2.000, 10));
    }
}

class Solution2 {
    public static double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if (b < 0) {
            x = 1 / x;
            b = -b;
        }
        while (b > 0) {
            // b & 1 == (n % 2 == 1)
            if((b & 1) == 1) res *= x;
            x *= x;
            //b >>= 1 == (n //= 2)
            System.out.println(b >>= 1);
            //System.out.println(b /= 2);
        }
        return res;
    }
}