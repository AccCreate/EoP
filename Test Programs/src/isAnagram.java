
public class isAnagram {
	public static void main(String[] args) {

		String input1 = "bbbc";
		String input2 = "bbcc";
		System.out.println(isAnagram2(input1, input2));
	}
	public static boolean isAnagram2(String input1, String input2) {
	    if(input1==null || input2==null || input1.length()!=input2.length()) return false;
	    
	    int bitArray = 0;
	    for(int i=0;i<input1.length();i++){
	        bitArray |= 1<<(input1.charAt(i)-'a');
	    }
	    for(int i=0;i<input2.length();i++){
	        bitArray &= ~(1<<(input2.charAt(i)-'a'));
	    }
	    
	    return bitArray == 0 ? true : false;
	}
}
