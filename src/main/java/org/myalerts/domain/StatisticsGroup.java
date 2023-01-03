package org.myalerts.domain;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@Getter
public final class StatisticsGroup {

    private StatisticsItem root;

    private List<StatisticsItem> leafs;

}

