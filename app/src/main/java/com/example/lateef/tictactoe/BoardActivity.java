package com.example.lateef.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    public String character = ChooseActivity.character;

    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    String aa, bb, cc, dd, ee, ff, gg, hh, ii;

    List<ImageView> board = new ArrayList<>();

    int click = 0;

    int x_score = 0;
    int o_score = 0;

    TextView scoreX;
    TextView scoreO;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        scoreX = findViewById(R.id.score_x);
        scoreO = findViewById(R.id.score_0);

        i1 = findViewById(R.id.box_1);
        i2 = findViewById(R.id.box_2);
        i3 = findViewById(R.id.box_3);
        i4 = findViewById(R.id.box_4);
        i5 = findViewById(R.id.box_5);
        i6 = findViewById(R.id.box_6);
        i7 = findViewById(R.id.box_7);
        i8 = findViewById(R.id.box_8);
        i9 = findViewById(R.id.box_9);

        board.add(i1);
        board.add(i2);
        board.add(i3);
        board.add(i4);
        board.add(i5);
        board.add(i6);
        board.add(i7);
        board.add(i8);
        board.add(i9);

        i1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i1.getDrawable() == null) {
                    if (character.equals("x")) {
                        i1.setTag(R.drawable.x);
                        i1.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 0) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }

                    } else {
                        i1.setTag(R.drawable.o);
                        i1.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 0) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });


        i2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i2.getDrawable() == null) {
                    if (character.equals("x")) {
                        i2.setTag(R.drawable.x);
                        i2.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 1) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i2.setTag(R.drawable.o);
                        i2.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 1) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i3.getDrawable() == null) {
                    if (character.equals("x")) {
                        i3.setTag(R.drawable.x);
                        i3.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 2) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i3.setTag(R.drawable.o);
                        i3.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 2) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i4.getDrawable() == null) {
                    if (character.equals("x")) {
                        i4.setTag(R.drawable.x);
                        i4.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 3) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i4.setTag(R.drawable.o);
                        i4.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 3) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i5.getDrawable() == null) {
                    if (character.equals("x")) {
                        i5.setTag(R.drawable.x);
                        i5.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 4) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i5.setTag(R.drawable.o);
                        i5.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 4) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i6.getDrawable() == null) {
                    if (character.equals("x")) {
                        i6.setTag(R.drawable.x);
                        i6.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 5) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i6.setTag(R.drawable.o);
                        i6.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 5) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i7.getDrawable() == null) {
                    if (character.equals("x")) {
                        i7.setTag(R.drawable.x);
                        i7.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 6) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i7.setTag(R.drawable.o);
                        i7.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 6) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i8.getDrawable() == null) {
                    if (character.equals("x")) {
                        i8.setTag(R.drawable.x);
                        i8.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 7) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);;
                                break;
                            }
                        }
                    } else {
                        i8.setTag(R.drawable.o);
                        i8.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 7) {
                                position = position + 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });

        i9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(i9.getDrawable() == null) {
                    if (character.equals("x")) {
                        i9.setTag(R.drawable.x);
                        i9.setImageResource(R.drawable.x);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 8) {
                                position = position - 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.o);
                                box.setImageResource(R.drawable.o);
                                break;
                            }
                        }
                    } else {
                        i9.setTag(R.drawable.o);
                        i9.setImageResource(R.drawable.o);

                        ImageView box;

                        for (int i = 0; i < 18; i++) {
                            int position = (int) (Math.random() * 8);
                            if (position == 8) {
                                position = position - 1;
                            }
                            box = board.get(position);
                            if (box.getDrawable() == null) {
                                box.setTag(R.drawable.x);
                                box.setImageResource(R.drawable.x);
                                break;
                            }
                        }
                    }
                    click = click + 1;
                    end();
                }
            }
        });
    }

    public boolean end(){
        aa = String.valueOf(i1.getTag());
        bb = String.valueOf(i2.getTag());
        cc = String.valueOf(i3.getTag());

        dd = String.valueOf(i4.getTag());
        ee = String.valueOf(i5.getTag());
        ff = String.valueOf(i6.getTag());

        gg = String.valueOf(i7.getTag());
        hh = String.valueOf(i8.getTag());
        ii = String.valueOf(i9.getTag());

        if(aa.equals("2131099751") && bb.equals("2131099751") && cc.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(aa.equals("2131099747") && bb.equals("2131099747") && cc.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(dd.equals("2131099751") && ee.equals("2131099751") && ff.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(dd.equals("2131099747") && ee.equals("2131099747") && ff.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(gg.equals("2131099751") && hh.equals("2131099751") && ii.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(gg.equals("2131099747") && hh.equals("2131099747") && ii.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(aa.equals("2131099751") && dd.equals("2131099751") && gg.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(aa.equals("2131099747") && dd.equals("2131099747") && gg.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(bb.equals("2131099751") && ee.equals("2131099751") && hh.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(bb.equals("2131099747") && ee.equals("2131099747") && hh.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(cc.equals("2131099751") && ff.equals("2131099751") && ii.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(cc.equals("2131099747") && ff.equals("2131099747") && ii.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(aa.equals("2131099751") && ee.equals("2131099751") && ii.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(aa.equals("2131099747") && ee.equals("2131099747") && ii.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        if(cc.equals("2131099751") && ee.equals("2131099751") && gg.equals("2131099751")){
            winX();
            disableBoard();
            return true;
        }

        if(cc.equals("2131099747") && ee.equals("2131099747") && gg.equals("2131099747")){
            winO();
            disableBoard();
            return true;
        }

        return false;
    }

    public void winX(){
        Toast.makeText(BoardActivity.this, "X won this round!",
                Toast.LENGTH_LONG).show();
        x_score = x_score + 1;
        String score = Integer.toString(x_score);
        scoreX.setText(score);
    }

    public void winO(){
        Toast.makeText(BoardActivity.this, "O won this round!",
                Toast.LENGTH_LONG).show();
        o_score = o_score + 1;
        String score = Integer.toString(o_score);
        scoreO.setText(score);
        disableBoard();
    }

    public void resetBoard(View view){
        for(int i = 0; i < 9; i++){
            ImageView box = board.get(i);
            box.setImageDrawable(null);
            box.setTag(null);
            box.setEnabled(true);
        }
    }

    public void disableBoard(){
        for(int i = 0; i < 9; i++){
            ImageView box = board.get(i);
            box.setEnabled(false);
        }
    }

}
