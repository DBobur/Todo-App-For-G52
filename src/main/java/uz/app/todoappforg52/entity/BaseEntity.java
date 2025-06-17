package uz.app.todoappforg52.entity;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class BaseEntity {
    private UUID id;

    {
        this.id = UUID.randomUUID();
    }
}
