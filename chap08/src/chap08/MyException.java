package chap08;

public class MyException extends Exception {
	private final int ERR_CODE;

	public MyException(String message, int err_code) {
		super(message);
		ERR_CODE = err_code;
	}
	
	public MyException(String message) {
		this(message, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
 }
