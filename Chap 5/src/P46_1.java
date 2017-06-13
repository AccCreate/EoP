/*
 * Decompiled with CFR 0_122.
 */

public class P46_1 {
    public static void main(String[] args) {
        long x = 223;
        System.out.println(P46_1.getParity1(x));
        System.out.println(P46_1.getParity2(x));
        System.out.println(P46_1.getParity3(x));
        System.out.println(P46_1.getParity4(x));
    }

    public static short getParity1(long x) {
        short result = 0;
        while (x != 0) {
            result = (short) ((long) result ^ x & 1);
            x >>>= 1;
        }
        return result;
    }

    public static short getParity2(long x) {
        short result = 0;
        while (x != 0) {
            result = (short) (result ^ 1);
            x &= x - 1;
        }
        return result;
    }

    public static short getParity3(long x) {
        short[] precomputedParity = new short[65536];
        int i = 0;
        while (i < 65536) {
            precomputedParity[i] = P46_1.getParity2(i);
            ++i;
        }
        int WORD_SIZE = 16;
        int BIT_MASK = 65535;
        return (short) (precomputedParity[(int) (x >>> 48 & 65535)] ^ precomputedParity[(int) (x >>> 32 & 65535)] ^ precomputedParity[(int) (x >>> 16 & 65535)] ^ precomputedParity[(int) (x & 65535)]);
    }

    public static short getParity4(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short) (x & 1);
    }
}
