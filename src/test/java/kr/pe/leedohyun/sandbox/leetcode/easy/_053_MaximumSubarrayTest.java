package kr.pe.leedohyun.sandbox.leetcode.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _053_MaximumSubarrayTest {
    _053_MaximumSubarray test = new _053_MaximumSubarray();

    @Test
    public void test() {
        assertEquals(6, test.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
