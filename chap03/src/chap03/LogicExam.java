package chap03;

public class LogicExam {
	public static void main(String[] args) {
		// AND(&&), OR(||)
		// true : 1, false : 0
		
		// AND(&&) : 모두 true(1)일 때만 true(1)
		// 0 0 1 1
		// 0 1 0 1
		// -------
		// 0 0 0 1
		
		// OR(||) : 하나라도 true(1)일 때 true(1)
		// 0 0 1 1
		// 0 1 0 1
		// -------
		// 0 1 1 1
		
		// NOT(!) : true(1) > false(0), false(0) > true(1)
		
		int i = 100;
		int j = 0;
		
		if(i == 100 || i / j == 0) { // ||는 불필요한 연산을 하지 않음
			System.out.println("25번 줄 통과");
		}
//		if(i == 100 | i / j == 0) { // 오류 : |는 불필요한 연산까지 함
//			System.out.println("28번 줄 통과");
//		}
		
	}
}
