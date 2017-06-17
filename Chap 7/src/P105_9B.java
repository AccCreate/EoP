import java.util.*;

/*
 * kes positive integer n and converts to shortest valid Roman number 
 *
 */
public class P105_9B{

    public static void main(String args[]){
        String roman = getRomanNumber(542);
        System.out.println(roman); 
    }

    public static String getRomanNumber(int n){
        TreeMap<Integer, String> T = new TreeMap<Integer, String>(){
            {
                put(1000, "M");
                put(900, "CM");
                put(500, "D");
                put(400, "CD");
                put(100, "C");
                put(90, "XC");
                put(50, "L");
                put(40, "XL");
                put(10, "X");
                put(9, "IX");
                put(5, "V");
                put(4, "IV");
                put(1, "I");

            }
        };
        int l = T.floorKey(n);
        if (n == l)
            return T.get(n);
        return T.get(l) + getRomanNumber(n- l);
    }    
}
