package org.myalerts;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.myalerts.domain.event.Event;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Consumer;

import static java.util.Optional.ofNullable;

/**
 * @author Mihai Surdeanu
 * @since 1.0.0
 */
@Slf4j
@Component
@RequiredArgsConstructor
public final class EventBroadcaster {

    private final Map<Class<? extends Event>, List<Consumer<Event>>> consumersMap = new HashMap<>();

    private final ThreadPoolExecutor threadPoolExecutor;

    /**
     * Provides ability to broadcast an event to all consumers registered as listeners.
     *
     * @param event: the event consumed by listeners
     */
    public synchronized void broadcast(final Event event) {
        ofNullable(consumersMap.get(event.getClass()))
            .orElse(List.of())
            .forEach(consumer -> threadPoolExecutor.execute(() -> consumer.accept(event)));
    }

    /**
     * Provides ability to register a consumer for consuming different type of events.
     *
     * @param consumer: consumer to be registered
     * @param acceptedEvent: class of events accepted to be received by the new listener
     */
    public synchronized void register(final Consumer<Event> consumer,
                                      final Class<? extends Event> acceptedEvent) {
        ofNullable(consumersMap.get(acceptedEvent)).ifPresentOrElse(
            consumers -> consumers.add(consumer),
            () -> consumersMap.put(acceptedEvent, new ArrayList<>(List.of(consumer)))
        );

        if (log.isDebugEnabled()) {
            log.debug("A new broadcast consumer is registered for event type '{}'.", acceptedEvent.getName());
        }
    }

}
