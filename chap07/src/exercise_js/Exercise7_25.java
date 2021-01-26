package exercise_js;

public class Exercise7_25 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(inner.iv);
		System.out.println(outer.new Inner().iv);
		
	}
}

class Outer {
	class Inner {
		int iv = 100;
	}
}
