package exercise_js;

public class Exercise7_22_23 {
	public static void main(String[] args) {
		Shape[] arr = {
				new Circle(5.0),
				new Rectangle(3, 4),
				new Circle(1)
		};
		System.out.println("면적의 합 : " + sumArea(arr));
	}
	
	static double sumArea(Shape[] shapes) {
		double sum = 0;
		for (Shape shape : shapes) {
			sum += shape.calcArea();
		}
		return sum;
	}
}

abstract class Shape {
	Point p;
	
	Shape() {
		this(new Point(0, 0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
	abstract double calcArea();
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}

class Circle extends Shape {
	double r;
	
	Circle(Point p, double r) {
		this.p = p;
		this.r = r;
	}
	
	Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	double calcArea() {
		return r * r * Math.PI;
	}
}

class Rectangle extends Shape {
	double width;
	double height;
	
	Rectangle(Point p, double width, double height) {
		this.p = p;
		this.width = width;
		this.height = height;
	}
	
	Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	double calcArea() {
		return this.width * this.height;
	}
	
	boolean isSquare() {
		return this.width == this.height ? true : false;
	}
}

