package com.xzw.doublepointersimple111213;

import java.util.Arrays;

/**
 * @author maroon
 * @date 2023/3/21 16:55
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 */
public class AdjustTheOrderOfTheArraySoThatOddNumbersAreInFrontOfEvenNumbers {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution5.exchange(new int[]{1,2,3,4})));
    }
}

class Solution5 {
    public static int[] exchange(int[] nums) {
        int a=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2==1){
                int temp=nums[i];
                nums[i]=nums[a];
                nums[a]=temp;
                a++;
            }
        }
        return nums;
    }
}