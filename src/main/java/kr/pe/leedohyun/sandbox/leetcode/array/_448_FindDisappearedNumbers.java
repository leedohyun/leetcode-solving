package kr.pe.leedohyun.sandbox.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array (Easy)
 * 나왔던 숫자의 인덱스를 찾아서 음수로 처리해서 마지막에 음수가 아닌 케이스만 출력하면 됨
 * 값을 체크할 때는 절대값으로 처리가 필요
 */
public class _448_FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        List<Integer> disNums = new LinkedList<Integer>();
        for (int i = 0; i < N; i++) {
            if (nums[i] > 0) {
                disNums.add(i + 1);
            }
        }
        return disNums;
    }
}

