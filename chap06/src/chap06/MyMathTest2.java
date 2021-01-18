package chap06;

public class MyMathTest2 {
	public static void main(String[] args) {
		
		// 클래스 메서드 호출 : 객체 생성 필요 X
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200.0, 100.0));
		
		// 인스턴스 메서드 호출 : 객체 생성 필요 O
		MyMath2 mm = new MyMath2();
		
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
				
	}
}

class MyMath2 {
	long a, b;													// 인스턴스 변수
	
	long add() { return a + b; }								// 인스턴스 메서드 : 인스턴스 변수를 사용
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	static long add(long a, long b) { return a + b; }			// 클래스 메서드 : 인스턴스 변수를 사용하지 않음
	static long subtract(long a, long b) { return a - b; }
	static long multiply(long a, long b) { return a * b; }
	static double divide(double a, double b) { return a / b; }
}
