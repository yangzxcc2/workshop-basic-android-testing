package workshop.testing.data.model;

import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

public class RecipeTest {

    @Test
    public void water(){
        //Arrange
        InputStream inputStream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");
        //Act
        Recipe recipe = Recipe.readFromStream(inputStream);
        //Assert
        assertNotNull(recipe);
        assertEquals("water",recipe.id);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.",recipe.description);
    }
    @Test
    public void no_id(){
        //Arrange
        InputStream inputStream = RecipeTest.class.getResourceAsStream("/recipes/no_id.txt");
        //Act
        Recipe recipe = Recipe.readFromStream(inputStream);
        //Assert
        assertNotNull(recipe);
        assertEquals("Water",recipe.title);
        assertEquals("Put glass under tap. Open tap. Close tap. Drink.",recipe.description);
    }

}