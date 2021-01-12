package chap02;

public class OpExam {

	public static void main(String[] args) {
		// 연산자, 피연산자
		// 1 + 1 = 2
		// 1, 2 : 피연산자, + : 연산자
		
		// 100 + 100L + 100.0
		// 200L + 100.0
		// 300.0 (int > long > double로 변환)
		
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; // 연산자가 들어가면 int로 바뀜
		byte b3 = (byte)(b1 + b2);
		
		char a = 'A';
//		char c = a + 1; // 
		char c = (char)(a + 1);
	}

}
