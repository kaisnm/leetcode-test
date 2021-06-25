package com.kaisnm.first100.f20;

/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，
 * 垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 说明：你不能倾斜容器。
 * <p>
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 解释：图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 * <p>
 * 输入：height = [1,1]
 * 输出：1
 * <p>
 * 输入：height = [4,3,2,1,4]
 * 输出：16
 * <p>
 * 输入：height = [1,2,1]
 * 输出：2
 */
public class Test11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1,1}));
        System.out.println(maxArea(new int[]{4,3,2,1,4}));
        System.out.println(maxArea(new int[]{1,2,1}));
        System.out.println(maxArea(new int[]{0, 0}));
    }

    public static int maxArea(int[] height) {
        int i = 0, j = height.length - 1, res = 0;
        while (i < j) {
            // 横轴长度 * 纵轴长度
            int col = height[i] - height[j] > 0 ? height[j] : height[i];
            res = Math.max((j - i) * col, res);
            int i1 = height[i] - height[j] > 0 ? j-- : i++;
        }
        return res;
//        int max = -1;
//        for (int k = 0; k < height.length - 1; k++) {
//            for (int j = k + 1; j < height.length; j++) {
//                //横轴长度 * 纵轴长度
//                int col = height[k] - height[j] > 0 ? height[j] : height[k];
//                max = Math.max((j - k) * col, max);
//            }
//        }
//        return max;
    }

}
