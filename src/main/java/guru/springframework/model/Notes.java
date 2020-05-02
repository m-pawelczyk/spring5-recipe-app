package guru.springframework.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 17.04.2020
 * created Notes in guru.springframework.model
 * in project spring5-recipe-app
 */
@Getter
@Setter
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String notes;
}
