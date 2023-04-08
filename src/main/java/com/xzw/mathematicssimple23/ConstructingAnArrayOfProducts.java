package com.xzw.mathematicssimple23;

import java.util.Arrays;

/**
 * @author maroon
 * @date 2023/4/8 17:24
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中B[i] 的值是数组 A 中除了下标 i 以外的元素
 * 的积, 即B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 */
public class ConstructingAnArrayOfProducts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution3.constructArr(new int[]{1, 2, 3, 4, 5})));
    }
}
class Solution3 {
    public static int[] constructArr(int[] a) {
        int[] ans = new int[a.length];
        for (int i = 0, p = 1; i < a.length; i++) {
            ans[i] = p;
            p = p * a[i];
        }
        for (int i = a.length - 1, p = 1; i >= 0; i--) {
            ans[i] = ans[i] * p;
            p = p * a[i];
        }
        return ans;
    }
}