package com.example.lawre.week1day4homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    String storedWord = "test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClick(View view)
    {

        switch(view.getId())
        {
            case R.id.tvFirstWord:
                storedWord = (((TextView)view).getText()).toString();
                break;
            case R.id.tvSecondWord:
                storedWord = ((TextView)view).getText().toString();
                break;
            case R.id.tvThirdWord:
                storedWord = ((TextView)view).getText().toString();
                break;
            case R.id.tvFourthWord:
                storedWord = ((TextView)view).getText().toString();
                break;
            case R.id.tvFifthWord:
                storedWord = ((TextView)view).getText().toString();
                break;
            case R.id.btNextGo:
                Intent myIntent = new Intent(this,NextActivity.class);
                Bundle myBundle = new Bundle();
                myBundle.putString("password",storedWord);
                myIntent.putExtras(myBundle);
                startActivity(myIntent);
                break;

        }
    }
}
