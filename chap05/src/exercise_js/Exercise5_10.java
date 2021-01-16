package exercise_js;

public class Exercise5_10 {
	public static void main(String[] args) {
		char[] abcCode = {
						  '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
						  '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',',
						  '.', '/'};
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		String src = "abc123";
		String result = "";
		
//		System.out.println((int)abcCode[0]);
//		System.out.println((int)abcCode[1]);
//		System.out.println((int)abcCode[2]);
//		System.out.println((int)abcCode[3]);
//		System.out.println((int)'a'); // 97
//		System.out.println((int)'z'); // 122
//		System.out.println((int)'0'); // 48
//		System.out.println((int)'9'); // 57
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			if (ch >= 97 && ch <= 122) {		// ch가 문자일 때
				result += abcCode[(int)ch-97];
			}
			if (ch >= 48 && ch <= 57) {		// ch가 숫자일 때
				result += numCode[(int)ch-48];
			}
//			System.out.println(result);
		}
		
		System.out.println("src: " + src);
		System.out.println("result: " + result);
	}
}
