package kr.pe.leedohyun.sandbox.leetcode.dp;

/**
 * currMax -> 현재까지 계산과정에서 나온 최대값 (현 시점에서 optimal이 아님)
 * globalMax -> 전체 최대값 (현 시점에서 optimal)
 * [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> [4, -1, 2, 1] = 6
 *   currMax : -2, 1, -2, 4, 3, 5, 6, 1, 5
 * globalMax : -2, 1,  1, 4, 4, 5, 6, 6, 6
 */
public class _053_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int currMax = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < N; i++) {
            currMax = Math.max(nums[i], currMax + nums[i]);
            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }
}
