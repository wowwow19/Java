package exercise_js;

public class Exercise7_26 {
	public static void main(String[] args) {
		Outer2.Inner2 staticInner = new Outer2.Inner2();
		System.out.println(staticInner.iv);
		System.out.println(new Outer2.Inner2().iv);
	}
}

class Outer2 {
	static class Inner2 {
		int iv = 200;
	}
}
