package chap08;

public class ExceptionEx9 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("고의로 발생시킨 예외");
			throw e;
//			thorw new Exception("고의로 발생시킨 예외");
		} catch (Exception e) {
			System.err.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었습니다.");
	}
}
