package com.example.lawre.week1day4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity
{
    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        displayText = findViewById(R.id.tvPassedWord);
        String textToDisplay = getIntent().getExtras().getString("password");
        if(textToDisplay != null)
            displayText.setText(textToDisplay);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.btMainGo)
        {
            Intent myIntent = new Intent(this,MainActivity.class);
            startActivity(myIntent);
        }
    }
}
