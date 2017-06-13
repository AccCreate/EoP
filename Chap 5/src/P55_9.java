/*
 * Decompiled with CFR 0_122.
 */

import java.io.PrintStream;

public class P55_9 {
    public static void main(String[] args) {
        System.out.println(P55_9.isPalindrome1(1234321));
        System.out.println(P55_9.isPalindrome2(1234321));
        System.out.println(Math.floor(Math.log10(1.0)) + 1.0);
    }

    public static boolean isPalindrome1(int x) {
        int z = x;
        int y = 0;
        while (x != 0) {
            y = y * 10 + x % 10;
            x /= 10;
        }
        if (y == z) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        if (x == 0) {
            return true;
        }
        int numDigits = (int) Math.floor(Math.log10(x)) + 1;
        int msdMask = (int) Math.pow(10.0, numDigits - 1);
        int i = 0;
        while (i < numDigits / 2) {
            if (x / msdMask != x % 10) {
                return false;
            }
            x %= msdMask;
            x /= 10;
            msdMask /= 100;
            ++i;
        }
        return true;
    }
}
