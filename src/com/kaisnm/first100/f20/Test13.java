package com.kaisnm.first100.f20;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 */
public class Test13 {

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n <= 1) {
            return "";
        }
        // 最长字串
        String res = strs[0];
        for (int i = 1; i < n; i++) {
            String s = strs[i];
            boolean end = true;
            while (res.length() > 0) {
                if (s.contains(res)) {
                    break;
                }
                //前后都截取一遍
            }
        }
        return res;
    }


}
