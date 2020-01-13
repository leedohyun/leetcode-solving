package kr.pe.leedohyun.sandbox.leetcode.easy;

import kr.pe.leedohyun.sandbox.leetcode.easy._476_NumberComplement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _476_NumberComplementTest {
    _476_NumberComplement test = new _476_NumberComplement();

    @Test
    public void test() {
//        assertEquals(2, test.findComplement(5));
//        assertEquals(0, test.findComplement(1));
//        assertEquals(13, test.findComplement(50));
//        assertEquals(27, test.findComplement(100));
        int i = 5;
        System.out.println("Binary Representation of "+ i + " : " + Integer.toBinaryString(i));
        int highestOneBit = Integer.highestOneBit(i);
        System.out.println("Highest one bit : " + Integer.toBinaryString(highestOneBit));
        int shiftBit = highestOneBit << 1;
        System.out.println("Shift bit : " + Integer.toBinaryString(shiftBit));
        int mask = shiftBit - 1;
        System.out.println("Mask is : " + Integer.toBinaryString(mask));
        System.out.println("Invert " + i + " : " + Integer.toBinaryString(~i));
        System.out.println("Final result : " + Integer.toBinaryString(~i & mask));
    }
}
