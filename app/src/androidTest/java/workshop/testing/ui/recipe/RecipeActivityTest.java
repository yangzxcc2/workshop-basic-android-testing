package workshop.testing.ui.recipe;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import workshop.testing.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;
import static workshop.testing.ui.recipe.RecipeActivity.KEY_ID;

public class RecipeActivityTest {
    @Rule
    public ActivityTestRule<RecipeActivity> activity = new ActivityTestRule(RecipeActivity.class,true,false);

    @Test
    public void OpenActivity(){
        activity.launchActivity(new Intent());
        onView(withId(R.id.description)).check(matches(withText("Recipe not found.")));
    }

    @Test
    public void success(){
        Intent intent = new Intent();
        intent.putExtra(KEY_ID,"chocolate_pudding");
        activity.launchActivity(intent);

        onView(withId(R.id.title)).check(matches(withText("Chocolate Pudding")));
        onView(withId(R.id.description)).check(matches(withText("2 tablespoons chocolate\n" +
                "yolks of 4 eggs\n" +
                "1 cup sugar\n" +
                "1 quart milk\n" +
                "1 whole egg\n" +
                "2 tablespoons corn starch\n" +
                "\n" +
                "Cook until it thickens, beat whites of eggs and put on top, put in oven to brown. Serve with cream, if preferred.")));
    }
}