package uz.app.todoappforg52.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoEntity extends BaseEntity{
    private UUID userId;
    private String todo;
    private TodoStatus status;
}
