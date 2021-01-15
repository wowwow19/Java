package chap05;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("프로그램의 사용법");
			System.out.println("java MainStringArrayArgument num1 num2");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// 데이터 타입간의 변환
		// int > String : ""
		// String > int : Integer.parseInt()
		
		int a = 10;
		
//		String s = a + "";
		String s = String.valueOf(a);		// int > String
		
		a = Integer.parseInt(s);			// String > int
		
		s = "123.456";
		double d = Double.parseDouble(s);	// String > double
		
		
	}
}
