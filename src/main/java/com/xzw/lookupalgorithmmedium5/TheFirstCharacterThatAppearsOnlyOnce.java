package com.xzw.lookupalgorithmmedium5;

/**
 * @author maroon
 * @date 2023/3/13 11:43
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 */
public class TheFirstCharacterThatAppearsOnlyOnce {
    public static void main(String[] args) {

    }
}
class Solution6 {
    public char firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return c;
            }
        }
        return ' ';
    }
}