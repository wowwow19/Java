package exercise_js;

public class Exercise5_4 {
	public static void main(String[] args) {
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		
		int total = 0;
		float average = 0;
		int count = 0;
		
		for (int[] numbers : arr) {
			for (int number : numbers) {
				total += number;
				count++;
			}
		}
				
		average = (float) total / count;
		
		System.out.println("total = " + total);
		System.out.println("average = " + average);
	}
}
