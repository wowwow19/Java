package chap02;

public class CharExam {

	public static void main(String[] args) {
		// char 2byte : 0 ~ 65535
		// short 2byte : -32768 ~ 32767
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '\u0041';
		char c4 = '가';
		char c5 = 44032; // oxAC00
		char c6 = '\uac00';
		
		int unicode = c1;
		
		System.out.println(c1); // A
		System.out.println(c2); // A
		System.out.println(c3); // A
		System.out.println(c4); // 가
		System.out.println(c5); // 가
		System.out.println(c6); // 가
		System.out.println(unicode); // 65
		
		char c7 = ' '; // 공백으로 문자타입 변수 초기화
	}

}
