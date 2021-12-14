package com.thaisDS3.demoDBF.domain;

import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Highscore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    @OneToOne
    @JoinColumn(name = "player_id_player")
    private Player player;

    private Instant data;
    private int pontos;
}
