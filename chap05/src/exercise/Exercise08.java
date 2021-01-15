package exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int number = 0;
		
		for (int[] scores : array) {
			for (int score : scores) {
				sum += score;
				number++;
			}
		}
		
		avg = (double) sum / number;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}
