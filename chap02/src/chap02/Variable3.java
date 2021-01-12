package chap02;

public class Variable3 {

	public static void main(String[] args) {
		int value;
		value = 5; // 변수는 선언 후 초기화해야 사용 가능
		int result = value + 10;
		System.out.println(result);
		
		// 변수의 사용범위 (scope)
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10; // v2 블록 내부에서만 존재
		}
//		int v3 = v1 + v2 + 5; // 오류
		
	}

}
