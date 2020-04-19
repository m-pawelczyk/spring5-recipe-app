package guru.springframework.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 17.04.2020
 * created Category in guru.springframework.model
 * in project spring5-recipe-app
 */
@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

}