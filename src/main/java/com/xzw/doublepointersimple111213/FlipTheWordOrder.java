package com.xzw.doublepointersimple111213;

/**
 * @author maroon
 * @date 2023/3/21 23:32
 */
public class FlipTheWordOrder {
    public static void main(String[] args) {
        System.out.println(Solution7.reverseWords(new String("  hello world!  ")));
    }
}
class Solution7 {
    public static String reverseWords(String s) {
        String[] s1 = s.trim().split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = s1.length - 1; i >= 0; i--) {
            if (s1[i].equals("")) {
                continue;
            }
            res.append(s1[i]).append(" ");
        }
        return res.toString().trim();
    }
}