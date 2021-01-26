package exercise_js;

public class UnsupportedFuctionException extends RuntimeException {
	private final int ERR_CODE;
	
	public UnsupportedFuctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return "[" + this.getErrorCode() + "]" + super.getMessage();
	}
}
