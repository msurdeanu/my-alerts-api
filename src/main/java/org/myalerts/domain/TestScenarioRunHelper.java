package org.myalerts.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.function.Supplier;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
public class TestScenarioRunHelper {

    @EqualsAndHashCode.Include
    private String name;

    private String descriptionKey;

    private Supplier<Helper> helperSupplier;

}
