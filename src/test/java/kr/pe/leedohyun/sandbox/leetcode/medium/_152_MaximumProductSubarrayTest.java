package kr.pe.leedohyun.sandbox.leetcode.medium;

import kr.pe.leedohyun.sandbox.leetcode.medium._152_MaximumProductSubarray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _152_MaximumProductSubarrayTest {
    _152_MaximumProductSubarray test = new _152_MaximumProductSubarray();

    @Test
    public void test() {
        assertEquals(6, test.maxProduct(new int[]{2, 3, -2, 4}));
        assertEquals(12, test.maxProduct(new int[]{-4, -3}));
        assertEquals(24, test.maxProduct(new int[]{-4, -3, -2, -1}));
        assertEquals(12, test.maxProduct(new int[]{-4, -3, 0, -2, -1}));
        assertEquals(2, test.maxProduct(new int[]{2, -1, 1, 1}));
    }
}
