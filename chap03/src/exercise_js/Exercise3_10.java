package exercise_js;

public class Exercise3_10 {
	public static void main(String[] args) {
		char ch = 'Z'; // '0' : 48, '9' : 57,  'A' : 65, 'a' : 97, 'z' : 122
//		char ch2 = 'z';
		
		boolean b = (ch >= 65 && ch <= 90) || // 대문자
					(ch >= 48 && ch <= 57) || // 숫자
					(ch >= 97 && ch <= 122);  // 소문자
//		System.out.println((int)ch);
//		System.out.println((int)ch2);
		System.out.println(b); //true
	}
}
