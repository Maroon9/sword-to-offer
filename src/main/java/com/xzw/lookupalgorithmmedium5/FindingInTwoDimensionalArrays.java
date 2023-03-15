package com.xzw.lookupalgorithmmedium5;

/**
 * @author maroon
 * @date 2023/3/13 11:23
 * 在一个 n * m 的二维数组中，每一行都按照从左到右非递减的顺序排序，
 * 每一列都按照从上到下非递减的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 *
 */
public class FindingInTwoDimensionalArrays {
}
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null ||  matrix.length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] > target) {
                col--;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                return true;
            }
        }
        return false;
    }
}