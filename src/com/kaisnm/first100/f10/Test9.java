package com.kaisnm.first100.f10;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：x = 121
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：x = -121
 * 输出：false
 * 解释：从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3：
 * <p>
 * 输入：x = 10
 * 输出：false
 * 解释：从右向左读, 为 01 。因此它不是一个回文数。
 * 示例 4：
 * <p>
 * 输入：x = -101
 * 输出：false
 *
 * @author: create by jikang.zhou
 * @date: 2021/6/10
 */
public class Test9 {

    public static void main(String[] args) {

        System.out.println(isPalindrome(1));

    }

    // 123454321
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int n = s.length();
        //几位数字
        int i;
        int j;
        if (n % 2 == 0) {
            i = n / 2 - 1;
            j = n / 2;
        } else {
            i = n / 2;
            j = i;
        }

        while (i >= 0) {
            if(s.charAt(i) == s.charAt(j)){
                i--;
                j++;
            }else {
                return false;
            }
        }
        return true;
    }

}
