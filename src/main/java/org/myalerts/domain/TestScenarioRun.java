package org.myalerts.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;

import static java.util.Optional.ofNullable;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@Getter
public class TestScenarioRun {

    private Integer scenarioId;

    private long duration;

    private String cause;

    private Instant created;

    public static class TestScenarioRunBuilder {
        public TestScenarioRunBuilder cause(final String message) {
            cause = message;

            return this;
        }

        public TestScenarioRunBuilder cause(final Throwable throwable) {
            cause = ofNullable(throwable)
                .map(item -> ofNullable(item.getCause()).map(Throwable::getMessage).orElseGet(item::getMessage))
                .orElse(null);

            return this;
        }
    }

}

