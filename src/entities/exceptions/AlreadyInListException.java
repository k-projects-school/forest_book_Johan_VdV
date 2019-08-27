package entities.exceptions;

public class AlreadyInListException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 412761690211711651L;

    /**
     * Constructs a new AlreadyInListException with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public AlreadyInListException() {
        super();
    }

    /**
     * Constructs a new AlreadyInListException with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param   message   the detail message. The detail message is saved for
     *          later retrieval by the {@link #getMessage()} method.
     */
    public AlreadyInListException(String message) {
        super(message);
    }
}
