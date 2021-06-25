package com.kaisnm.first100.f10;

import java.util.ArrayList;
import java.util.List;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * <p>
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "PAYPALISHIRING", numRows = 3
 * 输出："PAHNAPLSIIGYIR"
 * 示例 2：
 * 输入：s = "PAYPALISHIRING", numRows = 4
 * 输出："PINALSIGYAHRPI"
 * 解释：
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 示例 3：
 * <p>
 * 输入：s = "A", numRows = 1
 * 输出："A"
 *
 * @author: create by jikang.zhou
 * @date: 2021/6/9
 */
public class Test6 {

    public static void main(String[] args) {
        System.out.println(convert1("PAYPALISHIRING",4));
    }

    // 将字符按z型排列 是否需要下移一行
    public static String convert1(String s, int numRows) {

        if (numRows == 0 || numRows == 1) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        //下移上移都是一行一行的
        int curRow = 0;
        // true 下移一行  down上移一行
        boolean upDown = false;

        for (int i = 0; i < s.length(); i++) {
            list.get(curRow).append(s.charAt(i));
            //下移或下移一行的条件是什么 到顶或者到底
            if (curRow == 0 || curRow == numRows - 1) {
                upDown = !upDown;
            }
            curRow = upDown ? curRow + 1 : curRow - 1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder sb : list) {
            ret.append(sb);
        }
        return ret.toString();
    }


    //rows:4 第一行:   k(2*rows-2)
    //       中间行:   k(2*rows-2) + i ,(k+1)(2*rows-2)-i   1,5,7,11,13 i=currow-1
    //       中间行:   k(2*rows-2) + i ,(k+1)(2*rows-2)-i   2,4,8,10,14
    //       最后一行: 3,9,15  k(rows*2-2) + rows -1
    public static String convert(String s, int numRows) {

        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycleRow = 2 * numRows - 2;


        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j + i < n; j += cycleRow) {
                //第一行和最后一行
                sb.append(s.charAt(j + i));
                // 中间行
                if (i != 0 && i != numRows - 1 && j + cycleRow - i < n) {
                    sb.append(s.charAt(j + cycleRow - i));
                }
            }
        }
        return sb.toString();
    }

}
