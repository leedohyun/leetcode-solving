package kr.pe.leedohyun.sandbox.leetcode.easy;

/**
 * O(N) Solution
 */
public class _283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int N = nums.length;
        int curr = 0;
        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                nums[curr++] = nums[i];
            }
        }

        for (int i = curr; i < N; i++) {
            nums[i] = 0;
        }
    }
}

///**
// * O(N^2) Solution
// */
//public class _283_MoveZeroes {
//    public void moveZeroes(int[] nums) {
//        int N = nums.length;
//        for (int i = 0; i < N - 1; i++) {
//            if (nums[i] != 0) {
//                continue;
//            }
//            for (int j = i + 1; j < N; j++) {
//                if (nums[j] == 0) {
//                    continue;
//                } else {
//                    int temp = nums[i];
//                    nums[i] = nums[j];
//                    nums[j] = temp;
//                    break;
//                }
//            }
//        }
//    }
//}
