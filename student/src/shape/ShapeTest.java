package shape;

public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Rectangle(2, 3);
		shapes[1] = new Circle(5);
		shapes[2] = new Cube(new Rectangle(2, 3), 5);
		shapes[3] = new Cylinder(new Circle(5), 5);
		
//		System.out.println(shapes[1].perimeter);
//		System.out.println(shapes[1].area);
//		System.out.println(shapes[1].color);
//		System.out.println(shapes[0].perimeter);
//		System.out.println(shapes[0].area);
//		System.out.println(shapes[0].color);
		for (Shape shape : shapes) {
			System.out.println(shape);
		}
	}
}

// 도형 클래스 (최상위 추상 클래스)
// 사각형 Rectangle
	// 둘레, 넓이 : 너비(width), 높이(height)
// 원 Circle
	// 둘레, 넓이 : 반지름(radius), 파이(pi)

// 3차원 도형
// 육면체 Cube : 사각형을 포함
	// 넓이
	// 부피
// 원기둥 Cylinder : 원을 포함
	// 넓이
	// 부피 : 반지름(radius), 파이(pi), 높이(z)

class Shape {
	String color;
	double perimeter;
	double area;
	int height;
	double surfaceArea;
	double volume;
		
	Shape() {
		color = "black";
	}
	Shape(String color) {
		this.color = color;
	}
}

class Circle extends Shape {
	int radius;
		
	Circle() {}
	
	Circle(int radius) {
		super("red");
		this.radius = radius;
		this.perimeter = radius * 2 * Math.PI; 
		this.area = radius * radius * Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", perimeter=" + perimeter + ", area=" + area + "]";
	}
	
}

class Rectangle extends Shape {
	int width;
	int height;
		
	Rectangle() {}
	
	Rectangle(int width, int height) {
		super("blue");
		this.width = width;
		this.height = height;
		this.perimeter = width + height * 2;
		this.area = width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", perimeter=" + perimeter
				+ ", area=" + area + "]";
	}
	
}

class Cylinder extends Shape {
	Circle circle;
	
	Cylinder(Circle circle, int height) {
		super("green");
		this.circle = circle;
		this.height = height;
		this.surfaceArea = circle.perimeter * height + 2 * circle.area;
		this.volume = circle.area * height;
	}

	@Override
	public String toString() {
		return "Cylinder [circle=" + circle + ", color=" + color + ", height=" + height + ", surfaceArea=" + surfaceArea
				+ ", volume=" + volume + "]";
	}
	
}

class Cube extends Shape {
	Rectangle rectangle;
	
	Cube(Rectangle rectangle, int height) {
		super("yellow");
		this.rectangle = rectangle;
		this.height = height;
		this.surfaceArea = rectangle.perimeter * height + 2 * rectangle.area;
		this.volume = rectangle.area * 8;
	}

	@Override
	public String toString() {
		return "Cube [rectangle=" + rectangle + ", color=" + color + ", height=" + height + ", surfaceArea="
				+ surfaceArea + ", volume=" + volume + "]";
	}
	
}