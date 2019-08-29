package com.example.mirodone.rpsls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private static final int ROCK = 0;
    private static final int PAPER = 1;
    private static final int SCISSORS = 2;
    private static final int LIZARD = 3;
    private static final int SPOCK = 4;

    private ImageView img_cpu, img_player;

    private Button rock, paper, scissors, lizard, spock;

    private TextView tv_info;

    private Random mRandom;
    private int playerCPU, playerPLAYER;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img_cpu = findViewById(R.id.img_cpu);
        img_player = findViewById(R.id.img_player);

        rock = findViewById(R.id.rock);
        paper = findViewById(R.id.paper);
        scissors = findViewById(R.id.scissors);
        lizard = findViewById(R.id.lizard);
        spock = findViewById(R.id.spock);

        tv_info = findViewById(R.id.tv_info);
        mRandom = new Random();

        rock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerPLAYER = ROCK;
                playerCPU = mRandom.nextInt(5);
                setImages(playerPLAYER, playerCPU);
                tv_info.setText(getWinnerText(getWinner(playerPLAYER,playerCPU)));
            }
        });

        paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerPLAYER = PAPER;
                playerCPU = mRandom.nextInt(5);
                setImages(playerPLAYER, playerCPU);
                tv_info.setText(getWinnerText(getWinner(playerPLAYER,playerCPU)));
            }
        });

        scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerPLAYER = SCISSORS;
                playerCPU = mRandom.nextInt(5);
                setImages(playerPLAYER, playerCPU);
                tv_info.setText(getWinnerText(getWinner(playerPLAYER,playerCPU)));
            }
        });

        lizard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerPLAYER = LIZARD;
                playerCPU = mRandom.nextInt(5);
                setImages(playerPLAYER, playerCPU);
                tv_info.setText(getWinnerText(getWinner(playerPLAYER,playerCPU)));
            }
        });

        spock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playerPLAYER = SPOCK;
                playerCPU = mRandom.nextInt(5);
                setImages(playerPLAYER, playerCPU);
                tv_info.setText(getWinnerText(getWinner(playerPLAYER,playerCPU)));
            }
        });

    }
    // game winner

    private int getWinner(int a, int b) {
        return a == b ? 0 : (a - b + 5) % 5 <= 2 ? 1 : -1;
        //returns 1 if a is the winner, -1 if b is the winner, returns 0 if is a tie
    }

    private String getWinnerText (int result) {
        switch (result){
            case 1:
                return "You win !";
            case -1:
                return "Computer Wins!";
            case 0:
                return "It's a tie!";
                default:
                    return "";
        }
    }

    //set images
    private void setImages (int x, int y){
        switch (x){
            case ROCK:
                img_player.setImageResource(R.drawable.hand_rock_200);
                break;
            case PAPER:
                img_player.setImageResource(R.drawable.hand_paper_200);
                break;
            case SCISSORS:
                img_player.setImageResource(R.drawable.hand_scissors_200);
                break;
            case LIZARD:
                img_player.setImageResource(R.drawable.hand_lizard_200);
                break;
            case SPOCK:
                img_player.setImageResource(R.drawable.hand_spock_200);
                break;

        }

        switch (y){
            case ROCK:
                img_cpu.setImageResource(R.drawable.hand_rock_200);
                break;
            case PAPER:
                img_cpu.setImageResource(R.drawable.hand_paper_200);
                break;
            case SCISSORS:
                img_cpu.setImageResource(R.drawable.hand_scissors_200);
                break;
            case LIZARD:
                img_cpu.setImageResource(R.drawable.hand_lizard_200);
                break;
            case SPOCK:
                img_cpu.setImageResource(R.drawable.hand_spock_200);
                break;
        }
    }

}

