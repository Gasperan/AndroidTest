package com.android.gaspar.roboelectricexample;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView mText;
    private EditText mInput;
    private Button mButton;
    private Button mNewActivityButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mText = (TextView) findViewById(R.id.textView);
        mInput = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);
        mNewActivityButton = (Button) findViewById(R.id.buttonNewActivity);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mText.setText(mInput.getText());
            }
        });

        mNewActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchNewActivity();
            }
        });
    }


    public void launchNewActivity() {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
