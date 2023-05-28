package com.example.myappoihjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button btn;
    TextView tv1, tv2, tv3;
    Intent gi;
    int result1;
    int result2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = findViewById(R.id.btn);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        gi = getIntent();
        result1 = gi.getIntExtra("score1", 0);
        result2 = gi.getIntExtra("score2", 0);
        tv1.setText(String.valueOf(result1) + "clicks");
        tv2.setText(String.valueOf(result2) + "clicks");
        if (result1>result2) {
            tv3.setText("Player 1 is the winner!");
        }
        else if (result1<result2){
            tv3.setText("Player 2 is the winner!");
        }
        else{
            tv3.setText("There is a Teko between the players!");
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK, gi);
                finish();
            }
        });
    }
}