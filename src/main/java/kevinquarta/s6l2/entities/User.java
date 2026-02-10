package kevinquarta.s6l2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Random;

@Getter
@Setter
@ToString
public class User {
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
    private String avatar;

    public User(String name,String surname, String email, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
        this.avatar="https://ui-avatars.com/api/?name="+name+"+"+surname;
    }
}
