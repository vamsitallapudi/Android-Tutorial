package com.processmap.myfirstdemoproject.sqlite;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.processmap.myfirstdemoproject.R;

public class ReadSQLActivity extends AppCompatActivity {

    DatabaseHelper mDatabaseHelper;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_sql);
        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        mDatabaseHelper = new DatabaseHelper(this);
        Cursor cursor = mDatabaseHelper.readData();
        if(cursor.getCount()>0){
            while (cursor.moveToNext()){
                Toast.makeText(this, cursor.getString(1), Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "No data available!", Toast.LENGTH_SHORT).show();
        }

    }
}
