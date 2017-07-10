import java.util.*;

public class FirstNonDuplicateChar {
	
	public static void main(String[] args) {
		
	}

	
	// java.util.* has been imported for this problem.
	// You don't need any other imports.

	public static Character firstNonRepeatedCharacter(String str) {

	    // If only interested in ascii (0~255) then we can make an array of size 256 O(k) memory and O(n) speed
	    // Do this for long text
	    Map<Character, Boolean> dict = new LinkedHashMap<Character, Boolean>();
	    for(int i = 0; i < str.length(); i++){
	        if(!dict.containsKey(Character.toLowerCase(str.charAt(i)))){
	            dict.put(Character.toLowerCase(str.charAt(i)), true);
	        } else {
	            dict.remove(Character.toLowerCase(str.charAt(i)));
	        }
	    }
	    if(dict.isEmpty())
	        return null;
	    
	    return dict.entrySet().iterator().next().getKey();

	    
	}
}
