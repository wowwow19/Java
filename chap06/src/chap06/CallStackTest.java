package chap06;

public class CallStackTest {
	public static void main(String[] args) {
		System.out.println("main() 시작");			// 1
		firstMethod();								// 2
		System.out.println("main() 종료");			// 7
	}
	
	static void firstMethod() {
		System.out.println("firstMethod() 시작");		// 3
		secondMethod();								// 4		
		System.out.println("firstMethod() 종료");		// 6
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");		// 5
	}
	
	// 자료구조 : 데이터를 어떻게 저장할 것인가
	// 스택, 큐
	// 스택(LIFO) : Last In First Out
	// 큐(FIFO) : First In First Out
}
