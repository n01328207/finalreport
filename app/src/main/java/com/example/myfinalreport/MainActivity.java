package com.example.myfinalreport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView goPrivacy1;
public TextView goPrivacy2;
public TextView goPrivacy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goPrivacy1 = (TextView) findViewById(R.id.gold);
        goPrivacy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GreenLightFamily.class);
                startActivity(intent);
            }
        });

        goPrivacy2 = (TextView) findViewById(R.id.platinum);
        goPrivacy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GreenLightFamily.class);
                startActivity(intent);
            }
        });

        goPrivacy3 = (TextView) findViewById(R.id.diamond);
        goPrivacy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GreenLightFamily.class);
                startActivity(intent);
            }
        });
    }
}