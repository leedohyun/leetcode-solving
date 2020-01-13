package kr.pe.leedohyun.sandbox.leetcode.easy;

import kr.pe.leedohyun.sandbox.leetcode.easy._026_RemoveDuplicates;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _026_RemoveDuplicatesTest {
    _026_RemoveDuplicates test = new _026_RemoveDuplicates();

    @Test
    public void test() {
        assertEquals(2, test.removeDuplicates(new int[] {1, 1, 2}));
        assertEquals(1, test.removeDuplicates(new int[] {9, 9, 9, 9, 9}));
        assertEquals(2, test.removeDuplicates(new int[] {1, 1, 1, 9, 9}));
    }
}
