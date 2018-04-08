package com.example.lateef.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class ChooseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
    }

    public static String character;

    public void clickCharacterX (View view){
        character = "x";
        Intent intent = new Intent(this, BoardActivity.class);
        startActivity(intent);
    }

    public void clickCharacterO (View view){
        character = "o";
        Intent intent = new Intent(this, BoardActivity.class);
        startActivity(intent);
    }
}
