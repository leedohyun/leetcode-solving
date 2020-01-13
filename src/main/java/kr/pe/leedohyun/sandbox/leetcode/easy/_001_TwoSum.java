package kr.pe.leedohyun.sandbox.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 001. Two Sum (Easy)
 */
public class _001_TwoSum {
    /**
     * O(N) solution
     * 같은 숫자가 있어도 마지막으로 나오는 숫자가 저장되므로 2개 비교에 문제 없음
     */
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        int N = nums.length;

        Map<Integer, Integer> inverted = new HashMap<Integer, Integer>();
        for (int i = 0; i < N; i++) {
            int complement = target - nums[i];
            if (inverted.containsKey(complement)) {
                ret[0] = inverted.get(complement);
                ret[1] = i;
                break;
            }
            inverted.put(nums[i], i);
        }
        return ret;
    }

//    /**
//     * O(N^2) solution
//     */
//    public int[] twoSum(int[] nums, int target) {
//        int[] ret = new int[2];
//        int N = nums.length;
//        for (int i = 0; i < N - 1; i++) {
//            boolean isFind = false;
//            for (int j = i + 1; j < N; j++) {
//                if (nums[i] + nums[j] == target) {
//                    ret[0] = i;
//                    ret[1] = j;
//                    isFind = true;
//                    break;
//                }
//            }
//
//            if (isFind) {
//                break;
//            }
//        }
//        return ret;
//    }
}
