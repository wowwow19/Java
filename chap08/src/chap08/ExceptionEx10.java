package chap08;

public class ExceptionEx10 {
	public static void main(String[] args) throws Exception{
		// Checked Exception : 처리구문(try-catch), throws 사용
//		try {
//			throw new Exception("던짐");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.err.println("프로그램 정상종료");
		Exception e = new Exception("던짐");
		throw e;
	}
}
