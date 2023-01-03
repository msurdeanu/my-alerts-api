package org.myalerts.provider;

import org.myalerts.domain.TestScenarioRunProperty;
import org.pf4j.ExtensionPoint;

import java.util.List;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface HelpersProvider extends ExtensionPoint {

    List<TestScenarioRunProperty> getTestScenarioRunProperties();

}
