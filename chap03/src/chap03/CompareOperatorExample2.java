package chap03;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;
		double v3 = 1.0;
		
		System.out.println(v2 == v3); // true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		System.out.println(v4 == v5); // false : 0.1f는 0.1의 근사값으로 입력이 됨
		System.out.println((float)v4 == v5); // true
		System.out.println(v4 == (double)v5); // false 
		System.out.println((int)(v4 * 10) == (int)(v5 * 10)); // true
		
		
		// 기본 자료형 : 변수에 데이터를 저장
		// 참조 자료형 : 변수에 데이터의 주소를 저장
		
		Object obj = new Object();
		Object obj2 = new Object();
		Object obj3 = obj;
		System.out.println(obj); // 주소가 출력됨
		
		// String 문자열, 참조자료형
		String str = "가나다라"; // 리터럴형 생성
		String str2 = new String("가나다라"); // 참조 자료형 생성
		
		// 동등비교 연산자
		System.out.println(obj == obj2); // false : 주소비교
		System.out.println(obj == obj3); // true
		
		// 문자열 비교
		System.out.println(str == str2); // false
		boolean result = str.equals(str2);
		System.out.println(result); // true
		
	}
}
