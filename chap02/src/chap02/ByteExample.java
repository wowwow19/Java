package chap02;

public class ByteExample {

	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
//		byte var6 = 128;	compile error
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		// 0 111 1111 >> 127
		// +        1
		// 1 000 0000 >> -128 (오버플로우)
		// -        1 >> 127 (언더플로우)
		
		System.out.println();
		System.out.println(var5); // 127
		System.out.println(++var5); // -128
		System.out.println(++var5); // -127
		System.out.println(++var5); // -126
		
		short var7 = 32767;
		System.out.println();
		System.out.println(var7); // 32767
		System.out.println(++var7); // -32768
		System.out.println(++var7); // -32767
		System.out.println(++var7); // -32766
		System.out.println(++var7); // -32765
		
		
	}

}
