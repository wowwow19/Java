package exercise_js;

public class Exercise3_11 {
	public static void main(String[] args) {
		char ch = 'Z';
		
		char lowerCase = ch >= 'A' && ch <= 'Z' ? (char)(ch + 32) : ch;
		
		System.out.println("ch : " + ch);
//		System.out.println((int)ch); // A : 65, Z : 90
		System.out.println("ch to lowerCase : " + lowerCase);
	}
}
