package org.myalerts.exception;

import org.myalerts.domain.CheckedSupplier;

import java.util.function.Consumer;

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

    public static <T> T wrap(CheckedSupplier<T> trySupplier) {
        return wrap(trySupplier, exception -> {
        });
    }

    public static <T> T wrap(CheckedSupplier<T> trySupplier, Consumer<Exception> catchExceptionConsumer) {
        try {
            return trySupplier.get();
        } catch (Exception exception) {
            catchExceptionConsumer.accept(exception);
            throw new AlertingRuntimeException(exception);
        }
    }

}
