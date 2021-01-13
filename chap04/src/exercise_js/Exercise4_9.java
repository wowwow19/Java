package exercise_js;

public class Exercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		
//		System.out.println(str.charAt(0)); // '1' : 49
//		System.out.println((int)(str.charAt(0)));
//		System.out.println(str.charAt(1)); // '2' : 50
//		System.out.println(str.charAt(2)); // '3' : 51
//		System.out.println(str.charAt(3)); // '4' : 52
//		System.out.println(str.charAt(4)); // '5' : 53
		
		for (int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - 48;
		}
		
		System.out.println("sum: " + sum); // 15
	}
}
