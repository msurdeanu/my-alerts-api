package org.myalerts.domain.event;

import lombok.Builder;
import lombok.Getter;
import org.myalerts.domain.TestScenarioRun;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@Getter
public class TestScenarioRunEvent implements Event {

    private final TestScenarioRun testScenarioRun;

}
