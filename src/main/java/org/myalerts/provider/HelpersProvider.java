package org.myalerts.provider;

import org.myalerts.domain.TestScenarioRunHelper;
import org.pf4j.ExtensionPoint;

import java.util.stream.Stream;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface HelpersProvider extends ExtensionPoint {

    Stream<TestScenarioRunHelper> getTestScenarioRunHelpersAsStream();

}
