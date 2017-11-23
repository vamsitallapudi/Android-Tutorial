package com.processmap.myfirstdemoproject.activitiesanditsapplications.switchingactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.processmap.myfirstdemoproject.R;

public class SecondActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mTextView  = findViewById(R.id.textView2);
        if(getIntent()!=null){
            mTextView.setText(getIntent().getStringExtra("SUSHMA"));
        }

    }

    public void getThisPublicMethod(){

    }
    protected void getThisProtectedMethod(){

    }
    private void getThisPrivateMethod(){

    }
}
