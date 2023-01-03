package org.myalerts.domain;

import lombok.Builder;
import lombok.Getter;

import java.time.Instant;
import java.util.Set;

import static java.util.Optional.ofNullable;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@Getter
public final class TestScenarioRun {

    /**
     * Represents current test scenario id.
     */
    private Integer scenarioId;

    /**
     * Represents current scenario name for this run.
     */
    private String scenarioName;

    /**
     * Represents current scenario tags for this run.
     */
    private Set<String> scenarioTags;

    /**
     * Number of millis spent during test scenario execution phase.
     */
    private long duration;

    /**
     * In case of failure, represents the root cause of the failure.
     * In case of no failure, this field will have a null value.
     */
    private String cause;

    /**
     * Timestamp (UTC format) for run creation.
     */
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

