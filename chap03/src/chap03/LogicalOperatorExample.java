package chap03;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = '3';
		
		if((charCode >= 'A') & (charCode <= 'Z')) {
			System.out.println("대문자이군요.");
		}
		
		if ((charCode >= 'a') && (charCode <= 'z')) {
			System.out.println("소문자이군요.");
		}
		
		if (!(charCode < '0') && !(charCode > '9')) {
			System.out.println("숫자이군요.");
		}
		
		int value = 6;
		
		if (value % 2 == 0 | value % 3 == 0) {
			System.out.println("2또는 3의 배수이군요.");
		}
		
		if (value % 2 == 0 || value % 3 == 0) {
			System.out.println("2또는 3의 배수이군요.");
		}
	}
}
