import java.util.*;

public class isomorphicStrings {

	public static void main(String[] args) {
		
	}

	
	public static boolean isIsomorphic(String input1, String input2) {
	    if(input1 == null || input2 == null || input1.length() != input2.length())
	        return false;
	    
	    Map<Character, Integer> map1 = new HashMap<Character, Integer>();
	    Map<Character, Integer> map2 = new HashMap<Character, Integer>();
	    for(int i = 0; i < input1.length(); i++){
	        if((map1.containsKey(input1.charAt(i)) && map2.containsKey(input2.charAt(i))) && (map1.get(input1.charAt(i)) == map2.get(input2.charAt(i)))){
	            map1.put(input1.charAt(i), map1.get(input1.charAt(i)) + 1);
	            map2.put(input2.charAt(i), map2.get(input2.charAt(i)) + 1);
	        } else if(!(map1.containsKey(input1.charAt(i)) && map2.containsKey(input2.charAt(i)))) {
	            map1.put(input1.charAt(i), 1);
	            map2.put(input2.charAt(i), 1);
	        } else {
	            return false;
	        }
	        
	    }
	    
	    return true;
	}
}
