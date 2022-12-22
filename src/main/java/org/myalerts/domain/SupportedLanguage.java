package org.myalerts.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@RequiredArgsConstructor
public enum SupportedLanguage {
    ENGLISH("en");

    @Getter
    private final String code;

}
