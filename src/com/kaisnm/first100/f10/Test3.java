package com.kaisnm.first100.f10;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: create by jikang.zhou
 * @version: v1.0
 * @description: com.kaisnm.first100.f10
 * @date:2020/7/15
 */
public class Test3 {

    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     * <p>
     * 示例 1:
     * <p>
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     * <p>
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     * <p>
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     */

    public static void main(String[] args) {
//        String s = "aab";
        String s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    /**
     * 滑动窗口: 左指针从左开始向又移动一位 右指针向右移动直到有重复的字符
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int result = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (left < n) {
            if (left != 0) {
                map.remove(s.charAt(left - 1));
            }
            while (right < n && !map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                right++;
            }
            result = Math.max(right - left, result);
            left++;
        }
        return result;
    }


//    public static void main(String[] args) {
//        String s = "abcabcbb";
//        System.out.println(lengthOfLongestSubstring(s));
//    }


//    //TODO 滑动窗口！！！
//    public static int lengthOfLongestSubstring(String s) {
//        if (s.isEmpty()) {
//            return 0;
//        }
//        Set<Character> set = new HashSet<>();
//        int length = s.length();
//        int right = 0;
//        int result = 0;
//
//        for (int i = 0; i < length; i++) {
//
//            if (i != 0) {
//                set.remove(s.charAt(i - 1));
//            }
//            while (right < length && !set.contains(s.charAt(right))) {
//                set.add(s.charAt(right));
//                right++;
//            }
//            result = Math.max(result,right - i);
//        }
//
//        return result;
//
//    }


}
