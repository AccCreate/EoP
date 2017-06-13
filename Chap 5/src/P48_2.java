/*
 * Decompiled with CFR 0_122.
 */

import java.io.PrintStream;

public class P48_2 {
    public static void main(String[] args) {
        long x = 32;
        int i = 1;
        int j = 1;
        System.out.println(P48_2.swapBits1(x, i, j));
    }

    public static long swapBits1(long x, int i, int j) {
        String binaryStr = Long.toBinaryString(x);
        int binaryStrLen = binaryStr.length();
        int padZeroes = 64 - binaryStrLen;
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < padZeroes) {
            sb.append("0");
            ++k;
        }
        String binary64bitStr = String.valueOf(sb.toString()) + binaryStr;
        char[] binaryChar = binary64bitStr.toCharArray();
        char tempI = binaryChar[i];
        binaryChar[i] = binaryChar[j];
        binaryChar[j] = tempI;
        binaryStr = String.valueOf(binaryChar);
        long binaryVal = Long.parseLong(binaryStr);
        return binaryVal;
    }

    public static long swapBits2(long x, int i, int j) {
        if ((x >>> i & 1) != (x >>> j & 1)) {
            long bitMask = 1 << i | 1 << j;
            x ^= bitMask;
        }
        return x;
    }
}
