package com.processmap.myfirstdemoproject.activitiesanditsapplications.activityandlifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.processmap.myfirstdemoproject.R;

public class LifeCycleActivity extends AppCompatActivity {


    private static final String TAG = "LifeCycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Toast.makeText(this, "onCreate called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onRestart called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStop Called");
    }

    public void startSecondActivity(View view) {
        //start other activity
        Intent i = new Intent(this, SecondLifeCycleActivity.class);
        startActivity(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy Called");
    }
}
