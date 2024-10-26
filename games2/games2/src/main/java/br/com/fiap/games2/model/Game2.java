package br.com.fiap.games2.model;



import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_games2")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Game2 {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "SEQ_GAMES2"

    )
    @SequenceGenerator(
            name = "SEQ_GAMES2",
            sequenceName = "SEQ_GAMES2",
            allocationSize = 1
    )

    private Long gameId;


    private String title;
    private Double value;

    @Column(name = "release_date")
    private LocalDate releaseDate ;

}
