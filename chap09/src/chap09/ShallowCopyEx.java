package chap09;

public class ShallowCopyEx {
	public static void main(String[] args) {
		Circle circle1 = new Circle(new Point(1, 1), 2);
		Circle circle2 = circle1.shallowCopy();
		Circle circle3 = circle1.deepCopy();
		
		System.out.println(circle1);
		System.out.println(circle2);
		System.out.println(circle3);
		
		System.out.println();
		
		circle1.p.x = 9;
		circle1.p.y = 9;
		
		System.out.println(circle1);
		System.out.println(circle2);
		System.out.println(circle3);
	}
}

class Circle implements Cloneable {
	Point p;
	double r;
	
	public Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	public Circle shallowCopy() {	// 얕은 복사
		Circle circle = null;
		
		try {
			circle = (Circle) super.clone();
		} catch (CloneNotSupportedException e) {}
				
		return circle;
	}
	
	public Circle deepCopy() {		// 깊은 복사
		Circle circle = shallowCopy();
		circle.p = new Point(p.x, p.y);	// 멤버변수 중 참조자료형 변수를 새로 생성 후 복제
		return circle;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	
}

class Point {
	int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
