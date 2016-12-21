package kr.pe.leedohyun.sandbox.leetcode.array;

/**
 * 26. Remove Duplicates from Sorted Array
 * 새로운 배열을 만들지 않고 중복없는 수열을 배열 앞쪽에 배치하면 됨
 */
public class _026_RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int N = nums.length;
        int count = N;
        for (int i = 0; i < N - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = Integer.MIN_VALUE;
                count--;
            }
        }

        int pos = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != Integer.MIN_VALUE) {
                nums[pos++] = nums[i];
            }
        }
        return count;
    }
}
