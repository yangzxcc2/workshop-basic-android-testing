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
    }

}