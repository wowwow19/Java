package chap02;

public class Variable2 {
	public static void main(String[] args) {
		// '' : 문자 리터럴 입력
		char ch1 = '가';
		char ch2 = 'A';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		// escape 문자 : \로 시작
		// \t(탭), \n(줄바꿈), \r, \", \', \\
		System.out.println("\t");
		System.out.println("\n");
		System.out.println("\r");
		System.out.println("\'");
		
		// ASCII 코드
		// A : 65(10) >> 0x41(16)
		System.out.println('\u0041'); // A 출력
		System.out.println('\uAC00'); // 가 출력
		
		// "" : 문자열 리터럴 입력
		System.out.println("대한민국");
		System.out.println("탭만큼\t이동합니다.");
		System.out.println("한 줄\n내려쓰기");
		
		// true, false : 논리 리터럴
		System.out.println(true);
		System.out.println(false);
	}
}
