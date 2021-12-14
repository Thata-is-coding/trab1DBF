package com.thaisDS3.demoDBF.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Imagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    private String descricao;
    private String pathImagem;

    public static Imagem parseNote(String line) {
        String[] text = line.split(",");
        Imagem note = new Imagem();
        note.setId(Long.parseLong(text[0]));
        note.setDescricao(text[1]);
        return note;
    }
}
