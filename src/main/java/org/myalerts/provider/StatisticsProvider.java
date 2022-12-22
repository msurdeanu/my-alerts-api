package org.myalerts.provider;

import org.myalerts.domain.StatisticsGroup;
import org.pf4j.ExtensionPoint;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface StatisticsProvider extends ExtensionPoint {

    StatisticsGroup getStatisticsGroup();

}
