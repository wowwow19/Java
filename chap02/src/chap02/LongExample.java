package chap02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		
//		long var3 = 1_000_000_000_000; compile error
		long var4 = 1_000_000_000_000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3);
		System.out.println(var4);
		
		// 3.25
		// 10진수 >>  10^0 * 3 + 10^-1 * 2 + 10^-2 * 5
		// 2진수 >> 1/2 * ? + 1/4 * ? ....
		// 11.01[2]
		// 11.01 = 1.101 * 2^1
		// 0 10000000 1010000...0000
	}

}
