
public class cakeLie {
	public static void main (String[] args) {
		System.out.println(answer("11111"));
	}

	// O(1) memory
	public static int answer(String s) {
		if(s == null || s.length() == 0) return 0;

		int lengthS = s.length();
		int count = 1;
		int tempCount = 1;

		// Max size of pattern can only be half of String
		for(int i = 1; i <= lengthS / 2; i ++){
			tempCount = 1;

			checkSubString_loop:
				if(lengthS % i == 0) { // if String can be split into the patterns
					// Check pattern at every i-th position
					for(int j = i; j < lengthS; j += i) {
						for(int k = 0; k < i; k++) {
							if(s.charAt(k) != s.charAt(k + j)) {
								tempCount = 1;
								break checkSubString_loop;
							}
						}
						tempCount++;
					}
				}
			count = Math.max(count, tempCount);
		}
		return count;
	} 
}