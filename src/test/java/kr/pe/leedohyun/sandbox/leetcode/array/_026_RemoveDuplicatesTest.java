package kr.pe.leedohyun.sandbox.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 26. Remove Duplicates from Sorted Array
 */
public class _026_RemoveDuplicatesTest {
    _026_RemoveDuplicates test = new _026_RemoveDuplicates();

    @Test
    public void test() {
        assertEquals(2, test.removeDuplicates(new int[] {1, 1, 2}));
        assertEquals(1, test.removeDuplicates(new int[] {9, 9, 9, 9, 9}));
        assertEquals(2, test.removeDuplicates(new int[] {1, 1, 1, 9, 9}));
    }
}
