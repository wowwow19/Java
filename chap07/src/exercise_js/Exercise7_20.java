package exercise_js;

public class Exercise7_20 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println("p.x = " + p.x);		// 200 (X) -> 100 : 멤버변수는 참조변수의 타입을 따라감
		p.method();								// Parent Method (X) -> Child Method : 자손 클래스에서 오버라이딩했으므로
		System.out.println("c.x = " + c.x);		// 200
		c.method();								// Child Method
	}
}

class Parent {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}
