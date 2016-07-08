package test4.main.exception;

import org.sculptor.framework.errorhandling.ApplicationException;

public class CityNotFoundException extends ApplicationException {
	private static final long serialVersionUID = 1L;
	private static final String CLASS_NAME = CityNotFoundException.class.getSimpleName();
	private static final String CLASS_FULL_NAME = CityNotFoundException.class.getName();

	public CityNotFoundException(String m, java.io.Serializable... messageParameter) {
		super(CLASS_FULL_NAME, m);
		setMessageParameters(messageParameter);
	}

	public CityNotFoundException(int errorCode, String m, java.io.Serializable... messageParameter) {
		super(String.format("%1$s-%3$04d", CLASS_FULL_NAME, CLASS_NAME, errorCode), m);
		setMessageParameters(messageParameter);
	}
}
