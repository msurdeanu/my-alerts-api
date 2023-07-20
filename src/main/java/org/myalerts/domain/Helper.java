package org.myalerts.domain;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.reflect.Modifier.isPublic;
import static java.util.Arrays.stream;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface Helper {

    default Stream<String> getPublicMethodsAsStream() {
        return stream(getClass().getDeclaredMethods())
                .filter(method -> isPublic(method.getModifiers()))
                .map(method -> method.getName() + "(" + getAllParameterNamesAsStream(method)
                        .collect(Collectors.joining(" , ")) + ")");
    }

    private Stream<String> getAllParameterNamesAsStream(final Method method) {
        return stream(method.getParameters()).map(Parameter::getName);
    }

}
