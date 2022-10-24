package com.saeed.springbank.user.query.api.handlers;

import com.saeed.springbank.user.core.events.UserRegisteredEvent;
import com.saeed.springbank.user.core.events.UserRemovedEvent;
import com.saeed.springbank.user.core.events.UserUpdatedEvent;

public interface UserEventHandler {
    void on(UserRegisteredEvent event);
    void on(UserUpdatedEvent event);
    void on(UserRemovedEvent event);
}