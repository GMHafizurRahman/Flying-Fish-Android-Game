package com.example.exerciseproject_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {

    private Button playAgainBtn;
    private TextView scoreDisplayTextView;
    private String receiveScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        playAgainBtn = findViewById(R.id.play_again_button_id);
        scoreDisplayTextView = findViewById(R.id.displayScoreId);

        receiveScore = getIntent().getExtras().get("score").toString();

        playAgainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        scoreDisplayTextView.setText("Your Score = "+receiveScore);

    }
}