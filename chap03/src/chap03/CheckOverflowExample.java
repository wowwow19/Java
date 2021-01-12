package chap03;

public class CheckOverflowExample {
	public static void main(String[] args) {
		int left = 2_000_000_000;
		int right = 2_000_000_000;

		try {
			int result = safeAdd(left, right);
			System.out.println(result);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
	public static int safeAdd(int left, int right) {
		if(right > 0) {
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		} else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("언더플로우 발생");
			}
		}
		return left + right;
	}
}