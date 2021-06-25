package com.kaisnm.first100.f10;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * <p>
 * <p>
 * 示例 1：
 * 输入：x = 123
 * 输出：321
 * <p>
 * 示例 2：
 * 输入：x = -123
 * 输出：-321
 * <p>
 * 示例 3：
 * 输入：x = 120
 * 输出：21
 * <p>
 * 示例 4：
 * 输入：x = 0
 * 输出：0
 *
 * @author: create by jikang.zhou
 * @date: 2021/6/9
 */
public class Test7 {

    public static void main(String[] args) {
        System.out.println(reverse(120));
    }

    public static int reverse(int x) {
//        int b = Math.abs(x);
//        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b));
//        String s = stringBuilder.reverse().toString();
//        return x > 0 ? Integer.parseInt(s) : -Integer.parseInt(s);
        if (x == 0) {
            return 0;
        }
        List<Long> list = new ArrayList<>();
        list.add((long) (x % 10));
        long b = x;
        while ((b = b / 10) != 0) {
            long i = b % 10;
            list.add(i);
        }
        long result = 0;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            result += list.get(i) * Math.pow(10, n - i - 1);
        }
        if(result> Integer.MAX_VALUE || result< Integer.MIN_VALUE){
            return 0;
        }
        return (int)result;
    }

}
