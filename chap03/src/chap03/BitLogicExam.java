package chap03;

public class BitLogicExam {
	public static void main(String[] args) {
		int a = 9; // 1001
		int b = 3; // 0011
		
		System.out.println(a & b); // 1 : 0001
		System.out.println(a | b); // 11 : 1011
		System.out.println(a ^ b); // 10 : 1010
		
		System.out.println(~a); // -10 : 1..10110
		for (int i = 0; i < 28; i++)
			System.out.print(0);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(~a));
		
		System.out.println("--------------------------------");
		for (int i = 0; i < 21; i++)
			System.out.print(0);
		System.out.println(Integer.toBinaryString(1024));
		for (int i = 0; i < 19; i++)
			System.out.print(0);
		System.out.println(Integer.toBinaryString(1024 << 2));
		for (int i = 0; i < 23; i++)
			System.out.print(0);
		System.out.println(Integer.toBinaryString(1024 >> 2));
		
		System.out.println("--------------------------------");
		System.out.println(Integer.toBinaryString(-1024));
		System.out.println(Integer.toBinaryString(-1024 << 2));
		System.out.println(Integer.toBinaryString(-1024 >> 2)); // 부호의 변경이 일어나지 않음
		System.out.println(-1024 >> 2); // -256
		System.out.println("00" + Integer.toBinaryString(-1024 >>> 2)); // 부호의 변경이 일어남
		System.out.println(-1024 >>> 2); // 1073741568
	}
}
