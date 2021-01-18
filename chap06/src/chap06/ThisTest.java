package chap06;

public class ThisTest {
	public static void main(String[] args) {
		// this : 1인칭 > 3인칭
		// 미래에 생성될 객체의 주소값
		ThisCompo tc1 = new ThisCompo();
		tc1.printThis();			// tc1의 주소값
		System.out.println(tc1);	// tc1의 주소값
		
		ThisCompo tc2 = tc1.getThis();
		tc2.printThis();			// tc1의 주소값
		System.out.println(tc2);	// tc1의 주소값
	}
}

class ThisCompo {
	ThisCompo getThis() {
		return this;				// 미래에 생성될 객체의 주소값을 반환
	}
	
	void printThis() {
		System.out.println(this);	// 미래에 생성될 객체의 주소값을 출력
	}
	
	static void print() {
//		System.out.println(this);
	}
}
