package kevinquarta.s6l2.entities;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Blog {
    private long id;
    private String categoria;
    private String title;
    private String cover;
    private String content;
    private int tempoDiLettura;

    public Blog(String categoria, String title,String content, int tempoDiLettura) {
        this.categoria = categoria;
        this.title = title;
        this.cover = "https://picsum.photos/200/300";
        this.content = content;
        this.tempoDiLettura = tempoDiLettura;
        Random rndm = new Random();
        this.id = rndm.nextInt(1, 1000);
    }
}
