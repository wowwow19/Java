package exercise;

public class Exercise04 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		while (sum != 5) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			
			sum = dice1 + dice2;
			
			System.out.println("(" + dice1 + ", " + dice2 + ")");
		}
	}
}
