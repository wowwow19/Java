package chap09;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer(); // thread safe
		StringBuilder builder = new StringBuilder("abcde"); // thread unsafe
		builder.append(10);
		
		// buffer, builder의 차이 : 동기화
		
		// 멀티스레드상에서 동일 객체에 대한 데이터 차이가 발생
		
		// ArrayList : thread unsafe
		// Vector : thread safe
	}
}
