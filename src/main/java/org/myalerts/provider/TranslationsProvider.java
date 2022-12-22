package org.myalerts.provider;

import org.myalerts.domain.SupportedLanguage;
import org.pf4j.ExtensionPoint;

import java.util.Map;
import java.util.ResourceBundle;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface TranslationsProvider extends ExtensionPoint {

    Map<SupportedLanguage, ResourceBundle> getResourceBundles();

}
