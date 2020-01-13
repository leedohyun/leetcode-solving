package kr.pe.leedohyun.sandbox.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _001_TwoSumTest {
    _001_TwoSum test = new _001_TwoSum();

    @Test
    public void test() {
        int[] result = test.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);

        result = test.twoSum(new int[]{3, 2, 4}, 6);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);

        result = test.twoSum(new int[]{2, 1, 9, 4, 4, 56, 90, 3}, 8);
        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }
}
