package project;

public class WholeNumberException extends Exception{

	public WholeNumberException() {
		super();
	}

	public WholeNumberException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WholeNumberException(String message, Throwable cause) {
		super(message, cause);
	}

	public WholeNumberException(String message) {
		super(message);
	}

	public WholeNumberException(Throwable cause) {
		super(cause);
	}

}
