package chap06;

public class MarineExample {
	public static void main(String[] args) {
		Marine marine1 = new Marine();
		System.out.println(marine1);
		
		Marine marine2 = new Marine();
		System.out.println(marine2);
		System.out.println();
		
		marine1.hp -= 20;
		System.out.println(marine1);
		System.out.println(marine2);
		System.out.println();
		
		Marine.weapon++;	// 클래스 변수는 클래스명으로 접근
		System.out.println(marine1);
		System.out.println(marine2);
		System.out.println();
	}
}
