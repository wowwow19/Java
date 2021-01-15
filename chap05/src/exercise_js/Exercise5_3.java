package exercise_js;

public class Exercise5_3 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for (int number : arr) {
			sum += number;
		}
		
		System.out.println("sum = " + sum);
	}
}
