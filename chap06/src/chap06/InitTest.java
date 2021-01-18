package chap06;

public class InitTest {
	static int counter;
	
	static int print() {								// 3
		counter++;
		System.out.println(counter);
		return counter;
	}
	
	public static void main(String[] args) {
		InitCompo ic = new InitCompo();					// 1
		InitCompo ic2 = new InitCompo(1, 2);			// 8
//		new InitCompo();
	}
}

class InitCompo {
	static int si = InitTest.print();					// 2 : 명시적 초기화
	static int si2;								
	int i = InitTest.print();							// 5, 9
	int i2;
	
	static {											// 4
		System.out.println("클래스 초기화 블럭시작");	
		si2 = InitTest.print();
		System.out.println("클래스 초기화 블럭끝");
	}
	
	{													// 6, 10
		System.out.println("초기화 블럭시작");
		i2 = InitTest.print();
		si2 = InitTest.print();
		System.out.println("초기화 블럭끝");
	}
	
	public InitCompo() {								// 7, 12
		System.out.println("InitCompo()");
	}
	
	public InitCompo(int i, int i2) {					// 11
		this();
		System.out.println("InitCompo(int i, int i2)");	// 13
	}
}
