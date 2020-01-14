package kr.pe.leedohyun.sandbox.leetcode.easy;

/**
 * 007. Reverse Integer (Easy)
 * 주어진 32bit signed 정수 뒤집기
 * 123 -> 321, -123 -> -321, 120 -> 21
 */
public class _007_ReverseInteger {

    // long + math method
    public int reverse(int x) {
        int mod = 0;
        long output = 0;
        while (x != 0) {
            mod = x % 10;
            output = (output * 10) + mod;
            if (output > Integer.MAX_VALUE || output < Integer.MIN_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) output;
    }

//    // string method
//    public int reverse(int x) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(x).reverse();
//
//        String output = null;
//        if (sb.charAt(sb.length() - 1) == '-') {
//            sb.deleteCharAt(sb.length() - 1);
//            output = "-" + sb.toString();
//        } else {
//            output = sb.toString();
//        }
//
//        long result = Long.parseLong(output);
//        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : (int) result;
//    }
}
