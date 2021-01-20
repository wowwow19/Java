package chap07_3;

public class InstanceofTest {
	public static void main(String[] args) {
		Car fe = null;
//		System.out.println(fe.getClass().getName());
		fe = new FireEngine();
		System.out.println(fe.getClass().getName());
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if (fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if (fe instanceof Object) {
			System.out.println("This is a Object instance.");
		}
		
		if (fe instanceof Ambulance) {
			System.out.println("This is a Ambulance instance.");
		}
		System.out.println(fe.getClass().getName());
	}
}

class Car {}
class FireEngine extends Car {}
class Ambulance extends Car {}