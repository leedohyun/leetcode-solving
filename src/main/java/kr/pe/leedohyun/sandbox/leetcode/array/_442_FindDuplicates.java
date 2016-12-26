package kr.pe.leedohyun.sandbox.leetcode.array;

import java.util.List;

/**
 * 442. Find All Duplicates in an Array (Medium)
 */
public class _442_FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int max = Integer.MIN_VALUE;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            max = Math.max(nums[i], max);
        }
        return null;
    }
}

