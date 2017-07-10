
public class powerOf2 {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(6));
		System.out.println(isPowerOfFour(16));
		System.out.println(isPowerOfEight(52525));
	}


	public static boolean isPowerOfTwo(int n) {
		// 0b11111111111111111111111111111111
		return ((n & (n - 1)) == 0) && ((n & (0xFFFFFFFF))  != 0);
	}

	public static boolean isPowerOfFour(int n) {
		// 0b 0101 0101 0101 0101 0101 0101 0101 0101
		return (((n) & ((n - 1))) == 0) && ((n & (0x55555555)) != 0);
	}

	public static boolean isPowerOfEight(int n) {
		// 0b                            1001001001001
		// Fastest method = manually calculate this for power of 8 but... takes too long (O(1) speed and O(1) memory)
		// return (((n) & ((n - 1))) == 0) && ((n & (0xAAAAAAAA)) != 0);
		
		// BUT!!
		// there's also O(1) s/m.
		// Log_e_(val) = power
		return (Math.log(n) / Math.log(8)) % 1 == 0;
	}
}
