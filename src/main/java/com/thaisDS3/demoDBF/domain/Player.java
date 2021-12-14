package com.thaisDS3.demoDBF.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "table_pessoa")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    @NotNull
    @Column(name = "nickname", length = 28, nullable = false)
    private String nickname;

    private String email;
    private String senha;
    private String pais;
    private int nivel;
    private int ranking;

    @OneToOne
    @JoinColumn(name = "icon_id_imagem")
    private Imagem icon;

    public static Player parseNote(String line) {
        String[] text = line.split(",");
        Player note = new Player();
        note.setId(Long.parseLong(text[0]));
        note.setNickname(text[1]);
        return note;
    }

}
