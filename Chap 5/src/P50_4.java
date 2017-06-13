/*
 * Decompiled with CFR 0_122.
 */

public class P50_4 {
    static final int NUM_UNSIGNED_BITS = 63;

    public static void main(String[] args) {
        long x = 251305631;
        P50_4.closestBinSameWeight(x);
    }

    public static long closestBinSameWeight(long x) {
        int i = 0;
        while (i < 62) {
            if ((x >>> i & 1) != (x >>> i + 1 & 1)) {
                return x ^= 1 << i | 1 << i + 1;
            }
            ++i;
        }
        return x;
    }
}
