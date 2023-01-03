package org.myalerts.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
public class TestScenarioRunProperty {

    @EqualsAndHashCode.Include
    private String name;

    private Object value;

}
