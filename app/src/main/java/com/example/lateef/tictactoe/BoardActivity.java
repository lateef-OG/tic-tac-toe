package com.example.lateef.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class BoardActivity extends AppCompatActivity {

    public String character = ChooseActivity.character;

    ImageView i1, i2, i3, i4, i5, i6, i7, i8, i9;

    List<ImageView> board = new ArrayList<>();

    int click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        i1 = (ImageView) findViewById(R.id.box_1);
        i2 = (ImageView) findViewById(R.id.box_2);
        i3 = (ImageView) findViewById(R.id.box_3);
        i4 = (ImageView) findViewById(R.id.box_4);
        i5 = (ImageView) findViewById(R.id.box_5);
        i6 = (ImageView) findViewById(R.id.box_6);
        i7 = (ImageView) findViewById(R.id.box_7);
        i8 = (ImageView) findViewById(R.id.box_8);
        i9 = (ImageView) findViewById(R.id.box_9);

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
                if(character.equals("x")){
                    i1.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 0){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i1.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 0){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i1.setOnClickListener(null);
            }
        });


        i2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i2.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 1){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i2.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 1){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i2.setOnClickListener(null);
            }
        });

        i3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i3.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 2){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i3.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 2){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i3.setOnClickListener(null);
            }
        });

        i4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i4.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 3){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i4.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 3){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i4.setOnClickListener(null);
            }
        });

        i5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i5.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 4){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i5.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 4){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i5.setOnClickListener(null);
            }
        });

        i6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i6.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 5){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i6.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 5){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i6.setOnClickListener(null);
            }
        });

        i7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i7.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 6){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i7.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 6){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i7.setOnClickListener(null);
            }
        });

        i8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i8.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 7){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i8.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 7){
                            position = position + 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i8.setOnClickListener(null);
            }
        });

        i9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(character.equals("x")){
                    i9.setImageResource(R.drawable.x);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 8){
                            position = position - 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.o);
                            break;
                        }
                    }

                }
                else{
                    i9.setImageResource(R.drawable.o);

                    ImageView box;

                    for(int i = 0; i < 18; i++){
                        int position = (int )(Math.random() * 8);
                        if(position == 8){
                            position = position - 1;
                        }
                        box = board.get(position);
                        if(box.getDrawable() == null){
                            box.setImageResource(R.drawable.x);
                            break;
                        }
                    }
                }
                click = click + 1;
                i9.setOnClickListener(null);
            }
        });
    }

    public void end(){

    }
}
