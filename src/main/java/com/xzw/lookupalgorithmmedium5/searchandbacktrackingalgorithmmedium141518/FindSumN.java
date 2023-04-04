package com.xzw.lookupalgorithmmedium5.searchandbacktrackingalgorithmmedium141518;

/**
 * @author maroon
 * @date 2023/3/30 18:51
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class FindSumN {
}
class Solution9 {
    int res = 0;
    public int sumNums(int n) {
        boolean x = n > 1 && sumNums(n - 1) > 0;
        res += n;
        return res;
    }
}