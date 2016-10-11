package com.android.gaspar.roboelectricexample;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment {

    public TextView myText;


    public TestFragment() {
        // Required empty public constructor
    }


    public static TestFragment newInstance()
    {
        return new TestFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View parent =  inflater.inflate(R.layout.fragment_test, container, false);
        myText = (TextView) parent.findViewById(R.id.textViewFragment);
        return  parent;
    }

}
