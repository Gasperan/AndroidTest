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
 * Created by gaspar on 11-10-16.
 */
@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

    @Rule
    public ActivityTestRule<SecondActivity> secondActivityActivityTestRule = new ActivityTestRule<>(SecondActivity.class);


    @Test
    public void testFragment() throws Exception {
        onView(withId(R.id.buttonFragment)).perform(click());
        onView(withId(R.id.textViewFragment)).check(matches(withText("Soy un fragment")));
    }
}
