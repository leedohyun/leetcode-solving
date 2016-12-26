package kr.pe.leedohyun.sandbox.leetcode.array;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 414. Third Maximum Number (Easy)
 */
public class _441_ThirdMax {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> dedup = new TreeSet<Integer>();
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            dedup.add(nums[i]);
            if (dedup.size() > 3) {
                dedup.remove(dedup.first());
            }
        }
        return dedup.size() >= 3 ? dedup.first() : dedup.last();
    }

//    public int thirdMax(int[] nums) {
//        Set<Integer> dedup = new HashSet<Integer>();
//        int N = nums.length;
//        int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
//        for (int i = 0; i < N; i++) {
//            if (!dedup.contains(nums[i])) {
//                if (max[0] < nums[i]) {
//                    max[2] = max[1];
//                    max[1] = max[0];
//                    max[0] = nums[i];
//                } else if (max[1] < nums[i]) {
//                    max[2] = max[1];
//                    max[1] = nums[i];
//                } else if (max[2] < nums[i]) {
//                    max[2] = nums[i];
//                }
//            }
//            dedup.add(nums[i]);
//        }
//        return dedup.size() >= 3 ? max[2] : max[0];
//    }
}
