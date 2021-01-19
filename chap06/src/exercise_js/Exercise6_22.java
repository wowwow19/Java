package exercise_js;

public class Exercise6_22 {
	public static void main(String[] args) {
//		System.out.println((int)'0');
//		System.out.println((int)'9');
		
		String str = "123";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
		
		str = "1234o";
		System.out.println(str + "는 숫자입니까? " + isNumber(str));
	}
	
	static boolean isNumber(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 48 || str.charAt(i) >= 57) {
				return false;
			}
		}
		return true;
	}
}
