package exercise_js;

public class Exercise3_2 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 65

		System.out.println(1 + x << 33); // 0011(3) << 33 : 0110(6) 
		System.out.println(y >= 5 || x < 0 && x > 2); // false
		System.out.println(y += 10 - x++); // y = 13, x = 3;
		System.out.println(x += 2); // 5
		System.out.println(!('A' <= c && c <= 'Z')); // !true = false
		System.out.println('C' - c); // 2
		System.out.println('5' - '0'); // 5
		System.out.println(c + 1); // 66
		System.out.println(++c); // 'B'
		System.out.println(c++); // 'B'
		System.out.println(c); // 'C'
	}
}
