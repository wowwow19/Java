package chap07_3;

public class InnerEx6 {
	Object iv = new Object() { void method() { System.out.println("iv"); } };
	static Object cv = new Object() { void method() {} };
	
	void myMethod() {
		Object lv = new Object() { void method() {} };
	}
	
	public static void main(String[] args) {
		InnerEx6 ie6 = new InnerEx6();
		System.out.println(ie6.iv);
	}
}
