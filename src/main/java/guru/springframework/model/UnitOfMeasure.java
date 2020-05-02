package guru.springframework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 17.04.2020
 * created UnitOfMeasure in guru.springframework.model
 * in project spring5-recipe-app
 */
@Getter
@Setter
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
}
