package com.processmap.myfirstdemoproject.networking;

import android.content.SharedPreferences;
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

        mTextView = findViewById(R.id.textView);

        SharedPreferences sharedPreferences = getSharedPreferences("sharedPref", MODE_PRIVATE);

        String data = sharedPreferences.getString("username", "default");
        mTextView.setText(data);
    }
}
