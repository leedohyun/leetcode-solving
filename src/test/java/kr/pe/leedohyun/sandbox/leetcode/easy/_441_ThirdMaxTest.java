package kr.pe.leedohyun.sandbox.leetcode.easy;

import kr.pe.leedohyun.sandbox.leetcode.easy._441_ThirdMax;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _441_ThirdMaxTest {
    _441_ThirdMax test = new _441_ThirdMax();

    @Test
    public void test() {
        assertEquals(1, test.thirdMax(new int[] {3, 2, 1}));
        assertEquals(2, test.thirdMax(new int[] {1, 2}));
        assertEquals(1, test.thirdMax(new int[] {2, 2, 3, 1}));
        assertEquals(5, test.thirdMax(new int[] {5, 2, 2}));
        assertEquals(2, test.thirdMax(new int[] {1, 1, 2}));
        assertEquals(-2147483648, test.thirdMax(new int[] {1, 2, -2147483648}));
        assertEquals(4, test.thirdMax(new int[] {5, 2, 4, 1, 3, 6, 0}));
    }
}
