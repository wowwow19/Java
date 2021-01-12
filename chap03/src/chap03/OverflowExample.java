package chap03;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000_000;
		int y = 1000_000;
		int z1 = x * y;
		System.out.println(z1); // -727379968 : 쓰레기값
		
		long z2 = x * (long) y;
		System.out.println(z2);
		
		// validator : 값에 대한 검증을 하는 메소드
		
	}
}
