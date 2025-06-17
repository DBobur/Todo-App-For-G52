package uz.app.todoappforg52.entity;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity extends BaseEntity {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
