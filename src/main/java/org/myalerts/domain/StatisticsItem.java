package org.myalerts.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;

import static java.util.Optional.ofNullable;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
public final class StatisticsItem {

    @EqualsAndHashCode.Include
    private String name;

    private String icon;

    private Object value;

    private String description;

    public String getValueAsString() {
        return ofNullable(value).map(Object::toString).orElse(StringUtils.EMPTY);
    }

}
