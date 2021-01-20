package chap07_2;

public class SingletonTest {
	public static void main(String[] args) {
//		Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		
		s = null;
		System.out.println(s);
		s = Singleton.getInstance();
		System.out.println(s);
	}
}

final class Singleton {	// 싱글턴 디자인 패턴
	private static Singleton s = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (s == null) {
			s = new Singleton();
		}
		return s;
	}
}