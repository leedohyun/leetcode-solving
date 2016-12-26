package kr.pe.leedohyun.sandbox.leetcode.array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class _448_FindDisappearedNumbersTest {
    _448_FindDisappearedNumbers test = new _448_FindDisappearedNumbers();

    @Test
    public void test() {
        List<Integer> result = test.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertEquals(5, (int) result.get(0));
        assertEquals(6, (int) result.get(1));
    }
}
