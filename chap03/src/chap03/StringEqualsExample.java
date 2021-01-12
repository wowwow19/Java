package chap03;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1);
		System.out.println(strVar2);
		System.out.println(strVar3);
		
		// 문자열의 동등비교 연산은 주소값을 비교함
		System.out.println(strVar1 == strVar2); // true 
		System.out.println(strVar1 == strVar3); // false

		// 실제 담긴 문자열을 비교하려면 equals() 메서드를 이용해야 함
		System.out.println(strVar1.equals(strVar2)); // true
		System.out.println(strVar1.equals(strVar3)); // true
	}
}
