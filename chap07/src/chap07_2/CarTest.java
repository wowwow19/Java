package chap07_2;

public class CarTest {
//	public static void main(String[] args) {
//		Car car = null;
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe;
////		car.water();
//		fe2 = (FireEngine)car;
//		fe2.water();
//	}
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car;	// 이미 Car의 인스턴스이므로 형변환 불가
		fe.drive();
		car2 = fe;
		car2.drive();
	}
}

class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren!!!");
	}
}
