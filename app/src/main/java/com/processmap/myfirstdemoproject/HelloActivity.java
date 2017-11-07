package com.processmap.myfirstdemoproject;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class HelloActivity extends AppCompatActivity{

    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        mProgressBar = findViewById(R.id.progressBar);
        new MyAsyncTask().execute("");

    }

}