package com.example.lateef.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    public void onePlayer(View view){
        Intent intent = new Intent(this, ChooseActivity.class);
        startActivity(intent);
    }

    public void twoPlayers(View view){
        Intent intent = new Intent(this, TwoPlayersActivity.class);
        startActivity(intent);
    }
}
