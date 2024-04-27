package org.myalerts;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Stream;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Component
@RequiredArgsConstructor
public final class ApplicationManager {

    private final ApplicationContext applicationContext;

    public <T> T getBeanOfType(final Class<T> clazz) {
        return applicationContext.getBean(clazz);
    }

    public <T> Collection<T> getBeansOfType(final Class<T> clazz) {
        return applicationContext.getBeansOfType(clazz).values();
    }

    public <T> Stream<T> getBeansOfTypeAsStream(final Class<T> clazz) {
        return getBeansOfType(clazz).stream();
    }

}
