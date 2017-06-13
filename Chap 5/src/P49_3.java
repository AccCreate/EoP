/*
 * Decompiled with CFR 0_122.
 */

import java.io.PrintStream;

public class P49_3 {
    private static long[] precomputedReverse = new long[65536];

    public static void main(String[] args) {
        System.out.println(precomputedReverse.length);
        long x = 23886;
        int BIT_MASK = 65535;
        int WORD_SIZE = 16;
        System.out.println(x);
        System.out.println((int) (x & 65535) << 48);
        System.out.println((int) (x >>> 16) & 65535);
        System.out.println((int) (x >>> 32) & -65536);
        System.out.println((int) (x >>> 48) & 65535);
        System.out.println(3);
    }

    public static long reverseBits1(long x) {
        int WORD_SIZE = 16;
        int BIT_MASK = 65535;
        return precomputedReverse[(int) (x & 65535)] << 48 | precomputedReverse[(int) (x >>> 16) & 65535] << 32 | precomputedReverse[(int) (x >>> 32) & 65535] << 16 | precomputedReverse[(int) (x >>> 48) & 65535];
    }
}
