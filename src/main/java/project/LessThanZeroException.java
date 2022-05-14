package project;

public final class LessThanZeroException extends Exception{

	 public LessThanZeroException() {
			super();
		}

	public LessThanZeroException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public LessThanZeroException(String message, Throwable cause) {
		super(message, cause);
	}

	public LessThanZeroException(String message) {
		super(message);
	}

	public LessThanZeroException(Throwable cause) {
		super(cause);
	}
	
}
