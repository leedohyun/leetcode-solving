package kr.pe.leedohyun.sandbox.leetcode.array;

import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array (Easy)
 */
public class _448_FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int max = Integer.MIN_VALUE;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            max = Math.max(nums[i], max);
        }
        return null;
    }
}

