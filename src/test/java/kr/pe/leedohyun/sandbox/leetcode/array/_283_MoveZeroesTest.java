package kr.pe.leedohyun.sandbox.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class _283_MoveZeroesTest {
    _283_MoveZeroes test = new _283_MoveZeroes();

    @Test
    public void test() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        int[] result = new int[]{1, 3, 12, 0, 0};
        test.moveZeroes(nums);
        check(nums, result);

        nums = new int[]{0, 0, 0, 0, 1, 0, 123, 0};
        result = new int[]{1, 123, 0, 0, 0, 0, 0, 0};
        test.moveZeroes(nums);
        check(nums, result);
    }

    public void check(int[] nums, int[] result) {
        for (int i = 0; i < nums.length; i++) {
            assertEquals(result[i], nums[i]);
        }
    }
}
