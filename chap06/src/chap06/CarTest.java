package chap06;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		Car c3 = new Car("red", "manual", 2);
		Car c4 = new Car(c1);	// 객체 복제
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("white"); // 다른 생성자 호출
	}
	
	Car(String color) {
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;		// 청색 : 인스턴스 변수, 회색 : 파라미터(지역변수)
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c) {
//		color = c.color;
//		gearType = c.gearType;
//		door = c.door;
		this(c.color, c.gearType, c.door);
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
}
