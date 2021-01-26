package student;

public class MyRangeException extends Exception {
	private int start;
	private int end;
	
	public MyRangeException(int start, int end) {
		super(start + "부터 " + end + "사이의 숫자를 입력하세요.");
		this.start = start;
		this.end = end;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
}
