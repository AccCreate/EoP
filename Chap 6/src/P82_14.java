/*
 * Decompiled with CFR 0_122.
 */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P82_14 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int n = 3;
        System.out.println(P82_14.getSubset(A, n));
    }

    public static ArrayList<Integer> getSubset(ArrayList<Integer> A, int n) {
        Collections.shuffle(A);
        return new ArrayList<Integer>(A.subList(0, n));
    }
}
