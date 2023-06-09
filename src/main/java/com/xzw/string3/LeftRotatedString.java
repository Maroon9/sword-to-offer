package com.xzw.string3;

/**
 * @author maroon
 * @date 2023/3/11 19:54
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。
 * 比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 */
public class LeftRotatedString {
    public static void main(String[] args) {

    }
}
class Solution2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = n; i < s.length(); i++){
            sb.append(s.charAt(i));
        }
        for (int i = 0; i < n; i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}