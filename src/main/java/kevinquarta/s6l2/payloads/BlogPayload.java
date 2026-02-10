package kevinquarta.s6l2.payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class BlogPayload {
    private String categoria;
    private String title;
    private String content;
    private int tempoDiLettura;
}
