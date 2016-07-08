package test4.main.exception;

import org.sculptor.framework.errorhandling.ApplicationException;

public class RoleNotFoundException extends ApplicationException {
	private static final long serialVersionUID = 1L;
	private static final String CLASS_NAME = RoleNotFoundException.class.getSimpleName();
	private static final String CLASS_FULL_NAME = RoleNotFoundException.class.getName();

	public RoleNotFoundException(String m, java.io.Serializable... messageParameter) {
		super(CLASS_FULL_NAME, m);
		setMessageParameters(messageParameter);
	}

	public RoleNotFoundException(int errorCode, String m, java.io.Serializable... messageParameter) {
		super(String.format("%1$s-%3$04d", CLASS_FULL_NAME, CLASS_NAME, errorCode), m);
		setMessageParameters(messageParameter);
	}
}
