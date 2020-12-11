package sa.model.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
@RequiredArgsConstructor
public class User {

    @Id
    private Long id;
    private String account;
    private String password;
    private String name;
}
