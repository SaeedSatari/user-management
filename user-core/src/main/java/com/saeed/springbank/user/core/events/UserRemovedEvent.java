package com.saeed.springbank.user.core.events;

import lombok.Data;

@Data
public class UserRemovedEvent {
    private String id;
}