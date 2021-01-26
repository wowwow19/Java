package chap08;

public class ExceptionEx6 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);		// 예외 유발
//			System.out.println(args[0]);	// 예외 유발
			System.out.println(4);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());	// 예외메세지 출력
			
			System.out.println(e);
			System.out.println(5);
			
			StackTraceElement[] ste = e.getStackTrace();
			for(StackTraceElement st : ste) {
				System.out.println("StackTraceElement: " + st);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(50);
			e.printStackTrace();			// 정보와 오류메세지 출력
		} catch (RuntimeException e) {
			System.out.println(100);
		} catch (Exception e) {				// 조상 예외 클래스를 아래에 배치
			System.out.println(150);
		}
		
		System.out.println(6);
	}
}
