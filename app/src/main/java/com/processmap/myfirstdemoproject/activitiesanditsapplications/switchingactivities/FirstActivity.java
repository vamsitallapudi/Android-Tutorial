package com.processmap.myfirstdemoproject.activitiesanditsapplications.switchingactivities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.processmap.myfirstdemoproject.R;

public class FirstActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        editText = findViewById(R.id.editText);

    }


    public void startSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("SUSHMA", editText.getText().toString());
        startActivity(intent);

    }
}
