package exercise_js;

public class Exercise7_5 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	Product() {
		
	}
}

class Tv extends Product {
	Tv() {
//		super();
	}
	
	public String toString() {
		return "Tv";
	}
}