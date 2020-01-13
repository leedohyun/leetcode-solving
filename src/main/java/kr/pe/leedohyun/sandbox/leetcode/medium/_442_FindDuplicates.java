package kr.pe.leedohyun.sandbox.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 442. Find All Duplicates in an Array (Medium)
 * 나왔던 숫자의 인덱스를 찾아서 음수로 처리하고 또 나오는 경우가 중복
 * 값을 체크할 때는 절대값으로 처리가 필요
 */
public class _442_FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int N = nums.length;
        List<Integer> dupNums = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            } else {
                dupNums.add(val + 1);
            }
        }
        return dupNums;
    }
}

