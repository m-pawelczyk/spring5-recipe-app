package guru.springframework.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void getId() {
        Long id = 1024L;
        category.setId(id);
        assertEquals(id, category.getId());
    }

    @Test
    public void getDescription() {
        String desc = "Amerykańskie tłuste";
        category.setDescription(desc);
        assertEquals(desc, category.getDescription());
    }

    @Test
    public void getRecipes() {
    }
}