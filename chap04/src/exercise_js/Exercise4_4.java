package exercise_js;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while (sum < 100) {
			i++;
			sum += i % 2 == 0 ? -i : i;
//			i++;
		}
		
		System.out.println(i); // 199
		System.out.println(sum); // 100
		
	}
}
