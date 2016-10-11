package com.android.gaspar.roboelectricexample;

import android.content.Intent;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.Shadows;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.util.FragmentTestUtil.startFragment;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class ExampleUnitTest {

    MainActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void ProbarTexto() throws Exception {
        String text = "123";
        EditText myEdit = ((EditText) activity.findViewById(R.id.editText));
        myEdit.setText(text);
        ((Button) activity.findViewById(R.id.button)).performClick();
        String result = ((TextView) activity.findViewById(R.id.textView)).getText() + "";

        assertEquals(text, result);
    }

    @Test
    public void testNewActivity() throws Exception {
        Class sec = SecondActivity.class;
        Intent expectedIntent = new Intent(activity, SecondActivity.class);

        ((Button) activity.findViewById(R.id.buttonNewActivity)).performClick();


        ShadowActivity shadow = Shadows.shadowOf(activity);
        Intent actualIntent = shadow.getNextStartedActivity();

        assertTrue(expectedIntent.filterEquals(actualIntent));
    }

    @Test
    public void probarFragment() throws Exception {
        //TestFragment fragment = TestFragment.newInstance();
        //startFragment(fragment);
        //assertNotNull(fragment);
    }
}