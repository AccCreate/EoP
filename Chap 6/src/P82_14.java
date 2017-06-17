/*
 * Decompiled with CFR 0_122.
 */

import java.util.*;

public class P82_14 {
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int n = 3;
        System.out.println(P82_14.getSubset(A, n));
        System.out.println(randomSubset(5, 3)); 
    }

    public static ArrayList<Integer> getSubset(ArrayList<Integer> A, int n) {
        Collections.shuffle(A);
        return new ArrayList<Integer>(A.subList(0, n));
    }

    public static List<Integer> randomSubset (int n, int k){
        Map<Integer, Integer> changedElements = new HashMap<>();
        Random randIdxGen = new Random();

        for (int i = 0; i < k; i++){
            // Generate random int in [i, n - 1]
            int randIdx = i + randIdxGen.nextInt(n - i);
            //int randIdx = randIdxGen.nextInt(n);
            Integer ptr1 = changedElements.get(randIdx);
            System.out.println("ptr1 " + ptr1);
            Integer ptr2 = changedElements.get(i);
            System.out.println("ptr2 " + ptr2);
            if (ptr1 == null && ptr2 == null){
                changedElements.put(randIdx, i);
                changedElements.put(i, randIdx);
            } else if (ptr1 == null && ptr2 != null){
                changedElements.put(randIdx, ptr2);
                changedElements.put(i, randIdx);
            } else if(ptr1 != null && ptr2 == null){
                changedElements.put(i, ptr1);
                changedElements.put(randIdx, i);
            } else {
                changedElements.put(i, ptr1);
                changedElements.put(randIdx, ptr2);
            }
            System.out.println(changedElements); 
        }
        List<Integer> result = new ArrayList<>(k);
        for (int i = 0; i < k; ++i){
            result.add(changedElements.get(i));
        }
        return result;
    }
}

