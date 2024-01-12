package com.demo.iam.domain.commands;

import java.time.ZonedDateTime;
import java.time.ZoneId;

import java.util.UUID;

public abstract class Command {
    public final UUID id;
    public final ZonedDateTime createdTime;

    public Command() {
        this.id = UUID.randomUUID();
        this.createdTime = ZonedDateTime.now(ZoneId.of("UTC"));
    }
}
