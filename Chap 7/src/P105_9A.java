import java.util.*;

/*
 * Takes as input a string of Roman number symbols and checks whether that String is valid
 */
public class P105_9A{

    public static void main(String args[]){
        boolean result = checkRomanNumber("IIIIXCI");
        System.out.println(result);  

    }

    public static boolean checkRomanNumber(String roman){
        Map<Character, Integer> T = new HashMap<Character, Integer>(){
            {
                put('I', 1);
                put('V', 5);
                put('X', 10);
                put('L', 50);
                put('C', 100);
                put('D', 500);
                put('M', 1000);
            }
        };

        /*
         * Symbols appear nonincreasing order
         * I immediately precede V and X
         * X immediately precede L and C
         * C immediately precede D and M
         */
        if(roman.isEmpty())
            return true;

        int current = T.get(roman.charAt(roman.length() - 1));
        int rep = 0;
        for (int i = roman.length() - 2; i >= 0; --i){
            int prev = T.get(roman.charAt(i));
            if (prev < current){
                if (prev == T.get('I')){
                    if (current == T.get('V') || current == T.get('X'))
                        rep++;
                }
                if (prev == T.get('X')){
                    if (current == T.get('L') || current == T.get('C'))
                        rep++;
                }
                if (prev == T.get('C')){
                    if (current == T.get('D') || current == T.get('M'))
                        rep++;
                }
            }
            else{
                rep = 0;
            }

            if (rep > 1)
                return false;
            current = prev;
        }
        return true;
    }   


}

