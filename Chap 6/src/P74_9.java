/*
 * Decompiled with CFR 0_122.
 */

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class P74_9 {
    public static void main(String[] args) {
        ArrayList<Integer> perm = new ArrayList<Integer>(Arrays.asList(3, 1, 2, 4, 0));
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        P74_9.applyPermutation2(perm, A);
        System.out.println(A);
    }

    public static void applyPermutation(List<Integer> perm, List<Integer> A) {
        int i = 0;
        while (i < A.size()) {
            int next = i;
            while (perm.get(next) >= 0) {
                Collections.swap(A, i, (int) perm.get(next));
                int temp = perm.get(next);
                perm.set(next, perm.get(next) - perm.size());
                next = temp;
            }
            ++i;
        }
        i = 0;
        while (i < perm.size()) {
            perm.set(i, perm.get(i) + perm.size());
            ++i;
        }
    }

    public static void applyPermutation2(List<Integer> perm, List<Integer> A) {
        int i = 0;
        while (i < A.size()) {
            boolean isMin = true;
            int j = perm.get(i);
            while (j != i) {
                if (j < i) {
                    isMin = false;
                    break;
                }
                j = perm.get(j);
            }
            if (isMin) {
                P74_9.cyclicPermutation(i, perm, A);
            }
            ++i;
        }
    }

    private static void cyclicPermutation(int start, List<Integer> perm, List<Integer> A) {
        int i = start;
        int temp = A.get(start);
        do {
            int nextI = perm.get(i);
            int nextTemp = A.get(nextI);
            A.set(nextI, temp);
            i = nextI;
            temp = nextTemp;
        } while (i != start);
    }
}
