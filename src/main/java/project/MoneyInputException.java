package project;

public final class MoneyInputException extends Exception{
	
	public MoneyInputException() {
		super();
	}
		
	public MoneyInputException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MoneyInputException(String message, Throwable cause) {
		super(message, cause);
	}

	public MoneyInputException(String message) {
		super(message);
	}

	public MoneyInputException(Throwable cause) {
		super(cause);
	}
	
}
