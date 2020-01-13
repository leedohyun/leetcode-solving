package kr.pe.leedohyun.sandbox.leetcode.easy;

public class _476_NumberComplement {
    /**
     * 문자열로 다뤄서 처리하는 방법
     */
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder inversion = new StringBuilder(binary.length());
        for (int i = 0; i < binary.length(); i++) {
            inversion.append(binary.charAt(i) == '1' ? '0' : '1');
        }
        return Integer.parseUnsignedInt(inversion.toString(), 2);
    }

    /**
     * Bit manipulation
     */
//    public int findComplement(int num) {
////        int mask = (Integer.highestOneBit(num) << 1) - 1;
////        num = ~num;
//        return ~num;
//    }
}
