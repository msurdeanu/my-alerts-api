package org.myalerts.exception;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public class AlertingRuntimeException extends RuntimeException {

    public AlertingRuntimeException(final String message) {
        super(message);
    }

    public AlertingRuntimeException(final Throwable throwable) {
        super(throwable);
    }

    public AlertingRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
