package kr.pe.leedohyun.sandbox.leetcode.dp;

/**
 * [2, 3, -2, 4] -> [2, 3] = 6
 * [-4, -3, -2, -1] -> [-4, -3, -2, -1] = 24
 */
public class _152_MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int currMax = nums[0];
        int currMin = nums[0];
        int globalMax = nums[0];

        for (int i = 1; i < N; i++) {
            int tmpMax, tmpMin;
            if (nums[i] > 0) {
                tmpMax = Math.max(nums[i], nums[i] * currMax);
                tmpMin = Math.min(nums[i], nums[i] * currMin);
            } else {
                tmpMax = Math.max(nums[i], nums[i] * currMin);
                tmpMin = Math.min(nums[i], nums[i] * currMax);
            }

            currMax = tmpMax;
            currMin = tmpMin;
            globalMax = Math.max(globalMax, currMax);
        }

        return globalMax;
    }

//    public int maxProduct(int[] nums) {
//        int N = nums.length;
//        int currMax = nums[0];
//        int currMin = nums[0];
//        int globalMax = nums[0];
//
//        for (int i = 1; i < N; i++) {
//            int tmpMax, tmpMin;
//            tmpMax = Math.max(Math.max(nums[i], nums[i] * currMax), nums[i] * currMin);
//            tmpMin = Math.min(Math.min(nums[i], nums[i] * currMax), nums[i] * currMin);
//            currMax = tmpMax;
//            currMin = tmpMin;
//            globalMax = Math.max(globalMax, currMax);
//        }
//
//        return globalMax;
//    }
}
