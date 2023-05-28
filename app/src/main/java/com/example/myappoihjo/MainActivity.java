package com.example.myappoihjo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2, btn3;
    int counter1 = 0;
    int counter2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter1++;
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent si = new Intent(MainActivity.this, SecondActivity.class);
                si.putExtra("score1", counter1);
                si.putExtra("score2", counter2);
                startActivityForResult(si);
            }
        });
        btn3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                counter2 = counter2 +2;
                return false;
            }
        });
        protected void onActivityResult(int source, int good, @Nullable Intent data){
            if (data!=null){
                counter1=0;
                counter2=0;
            }

        }
    }
}