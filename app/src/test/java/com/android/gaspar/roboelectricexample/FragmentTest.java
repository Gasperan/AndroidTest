package com.android.gaspar.roboelectricexample;

import android.os.Build;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;


@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class FragmentTest  {

    SecondActivity activity;

    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(SecondActivity.class);
    }

    @Test
    public void probarLoadFragment() throws Exception {
        activity.findViewById(R.id.buttonFragment).performClick();

        View v = activity.findViewById(R.id.fragment_container);
        TextView t = (TextView) v.findViewById(R.id.textViewFragment);
        assertEquals(t.getText().toString(),"Soy un fragment");
    }
}
