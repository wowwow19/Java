package chap02;

public class Variable {
	public static void main(String[] args) {
		// 변수 : 하나의 값을 저장하기 위한 공간
		// 단 하나의 타입
		
		int age; // 정수(int)타입의 age변수 선언
		double value; // 실수(double)타입의 value변수 선언
		
		int x, y, z; // 여러개의 변수를 한 번에 선언 가능		
		
		// 클래스 명명법 : 대문자로 시작, 명사형태
		// 메서드 명명법 : 소문자로 시작, 동사형태
		// 변수 명명법 : 명사형태
		int maxSpeed; // 카멜표기법
		int maxspeed; // 다른변수로 인식
		
		int score; // 선언
		score = 90; // 할당
		
		int score2 = 90; // 선언과 할당을 동시에
		
		// 리터럴(literal) : 변수에 저장되는 값
		int val1 = 012; // 8진수 정수(0으로 시작)
		System.out.println(val1);
		
		int val2 = 0xFF; // 16진수 정수(0x로 시작)
		System.out.println(val2);
		
		double val3 = 3.14; // 실수
		
		double val4 = 5e3; // 5 x 10^3 : 지수표기법 -> 아주 작은 수를 입력할 때
		System.out.println(val4);
		
		double val5 = 5e-3; // 5 x 10^(-3)
		System.out.println(val5);
	}
	int getTotal (int a, int b) { // 메서드
		return a + b;
	}
}
