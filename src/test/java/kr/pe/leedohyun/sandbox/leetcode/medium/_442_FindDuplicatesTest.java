package kr.pe.leedohyun.sandbox.leetcode.medium;

import kr.pe.leedohyun.sandbox.leetcode.medium._442_FindDuplicates;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class _442_FindDuplicatesTest {
    _442_FindDuplicates test = new _442_FindDuplicates();

    @Test
    public void test() {
        List<Integer> result = test.findDuplicates(new int[]{4, 3, 2, 7, 8, 2, 3, 1});
        assertEquals(2, (int) result.get(0));
        assertEquals(3, (int) result.get(1));
    }
}
