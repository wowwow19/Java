package chap02;

public class CastingExample {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue; // 변수의 값은 변할 수 있으므로 casting 필요
		char charValue2 = 44032; // 리터럴을 직접 입력할 때는 casting 불필요
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		// byte(1), short(2), int(4), long(8), char(2), float(4), double(8), boolean(1)
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE); // 음수가 아님
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE); // 음수가 아님
		
	}
}
