package guru.springframework.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * m-pawelczyk (GitGub) / m_pawelczyk (Twitter)
 * on 25.04.2020
 * created NotesCommand in guru.springframework.commands
 * in project spring5-recipe-app
 */
@Getter
@Setter
@NoArgsConstructor
public class NotesCommand {
    private Long id;
    private String recipeNotes;

}
