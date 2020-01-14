package kr.pe.leedohyun.sandbox.leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _007_ReverseIntegerTest {
    _007_ReverseInteger test = new _007_ReverseInteger();

    @Test
    public void test() {
        int result = test.reverse(123);
        assertEquals(321, result);

        result = test.reverse(-123);
        assertEquals(-321, result);

        result = test.reverse(120);
        assertEquals(21, result);
    }
}
