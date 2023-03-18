package com.xzw.dynamicplanningmedium910;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maroon
 * @date 2023/3/18 20:33
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 */
public class TheLongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(Solution5.lengthOfLongestSubstring(new String("pwwkew")));
    }
}
class Solution5 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = -1, res = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                index = Math.max(index, map.get(c));
            }
            map.put(c, i);
            res = Math.max(res, i -  index);
        }
        return res;
    }
}