package kevinquarta.s6l2.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@ToString
public class UserPayload {
    private String name;
    private String surname;
    private String email;
    private LocalDate dateOfBirth;
}
