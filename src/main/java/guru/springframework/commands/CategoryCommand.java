package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 25.04.2020
 * created CategoryCommand in guru.springframework.commands
 * in project spring5-recipe-app
 */
@Setter
@Getter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
