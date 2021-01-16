package chap06;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		System.out.println(s1);		// 각각 다른 주소값을 가짐
		System.out.println(s2);
		
		int y;
		y = f(10);					// 메서드 호출
		System.out.println(y);
	}
	
	static int f(int x) {			// 메서드 정의
		return x * x;
	}
}
