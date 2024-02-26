package custom_exception;

public class ValidationException extends Exception {
	public ValidationException(String errmsg) {
		super(errmsg);
	}
}