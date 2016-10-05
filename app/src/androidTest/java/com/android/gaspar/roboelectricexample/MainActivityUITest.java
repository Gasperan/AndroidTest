package com.android.gaspar.roboelectricexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by gaspar on 05-10-16.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void editTextUpdatesTextView() throws Exception {
        // Arrange
        String givenString = "test123";

        // Act
        onView(withId(R.id.editText)).perform(typeText(givenString));
        onView(withId(R.id.button)).perform(click());

        // Assert
        onView(withId(R.id.textView)).check(matches(withText(givenString)));

    }

}
