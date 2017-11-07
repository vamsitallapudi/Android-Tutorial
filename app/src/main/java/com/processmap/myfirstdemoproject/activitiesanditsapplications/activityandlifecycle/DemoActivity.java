package com.processmap.myfirstdemoproject.activitiesanditsapplications.activityandlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.processmap.myfirstdemoproject.R;

public class DemoActivity extends AppCompatActivity {

    private TextView mTv;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

//        It calls the super classs's onCreate method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        mButton = findViewById(R.id.b_submit);
        mTv = findViewById(R.id.tv_name);


        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTv.setText("Hi there!");
            }
        });

    }
}
