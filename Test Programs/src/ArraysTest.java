import java.util.Arrays;
import java.util.List;

public class ArraysTest{
    public static void main (String[] args){
        System.out.println("no");
        List<int []> list1 = Arrays.asList(new int[] {1, 2, 4});
        System.out.println(list1); 
        for (int[] each: list1) {
            for (int each2: each){
                System.out.println(each2); 
            }
        }

        List<Integer> list2 = Arrays.asList(new Integer[] {1, 2, 4});
        System.out.println(list2);

        Integer [] arr1 = list2.toArray(new Integer [0]);

        List<Integer> list3 = Arrays.asList(Arrays.copyOf(list2.toArray(new Integer[0]), list2.size()));
        System.out.println(arr1); 
        System.out.println(list3); 
    }
}
