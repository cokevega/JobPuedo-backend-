package jobpuedo.api.exception;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private static final String DESCRIPTION = "Petición mal realizada";

	public BadRequestException(String details) {
		super(DESCRIPTION + ". " + details);
	}

}
