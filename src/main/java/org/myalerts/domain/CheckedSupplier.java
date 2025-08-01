package org.myalerts.domain;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@FunctionalInterface
public interface CheckedSupplier<T> {

    T get() throws Exception;

}