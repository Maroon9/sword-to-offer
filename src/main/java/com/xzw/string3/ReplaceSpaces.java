package com.xzw.string3;

/**
 * @author maroon
 * @date 2023/3/11 19:43
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class ReplaceSpaces {
    public static void main(String[] args) {

    }
}
class Solution1 {
    public String replaceSpace(String s) {
        if(s == null || s.length() == 0){
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                sb.append("  ");
            }
        }
        if(sb.length() == 0){
            return s;
        }
        int left = s.length() - 1;
        s += sb;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while(left >= 0){
            if(c[left] == ' '){
                c[right--] = '0';
                c[right--] = '2';
                c[right] = '%';
            }else{
                c[right] = c[left];
            }
            left--;
            right--;
        }
        return new String(c);
    }

    public String replaceSpace2(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') sb.append("%20");
            else sb.append(c);
        }
        return sb.toString();
    }
}