package kevinquarta.s6l2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private long id;
    private String name;
    private String surname;
    private String email;
}
