package com.example.lmjm1.drum;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class chart1 extends Fragment {
    TextView textview;
   // String title;
    public chart1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v1= inflater.inflate(R.layout.fragment_chart1, container, false);
       // TextView text1 = (TextView)v1.findViewById(R.id.textView);
        textview = (TextView)v1.findViewById(R.id.textView);
       // text1.setText(title);
        return v1;
    }


}
