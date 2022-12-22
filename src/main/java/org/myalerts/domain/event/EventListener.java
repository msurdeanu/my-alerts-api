package org.myalerts.domain.event;

import org.pf4j.ExtensionPoint;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
public interface EventListener<T extends Event> extends ExtensionPoint {

    void onEventReceived(T event);

    Class<T> getEventType();

}
