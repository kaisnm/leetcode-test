package com.kaisnm.first100.f10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，
 * 请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @author: create by jikang.zhou
 */
public class Test1 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));




    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>(nums.length);
        for (int i = 0;i<nums.length;i++) {
            if(map.containsKey(target-nums[i])){
               return new int[]{map.get(target-nums[i]),i};
            }else {
                map.put(nums[i],i);
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        int[] nums = {3, 3};
//        int target = 6;
//        int[] ints = twoSum(nums, target);
//        for (int anInt : ints) {
//            System.out.println(anInt + "-----");
//        }
//
//    }
//
//    public static int[] twoSum(int[] nums, int target) {
//        Map<Integer, Integer> map = new HashMap<>(nums.length);
//        int k = 0, v = 0;
//        for (int i = 0; i < nums.length; i++) {
//            Integer vInt = map.get(target - nums[i]);
//            if (vInt != null) {
//                k = i;
//                v = vInt;
//                break;
//            }
//            map.put(nums[i], i);
//        }
//        return new int[]{v,k};
//    }


}
