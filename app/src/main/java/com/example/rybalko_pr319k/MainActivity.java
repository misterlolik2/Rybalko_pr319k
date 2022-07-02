package com.example.rybalko_pr319k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText text3 = findViewById(R.id.txt3);
        EditText text4 = findViewById(R.id.txt4);
        Button nazvanie = (Button) findViewById(R.id.button23);
        nazvanie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text3.getText().toString().equals("") || text4.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Невереный логин или пароль", Toast.LENGTH_SHORT).show();
                } else {
                    Intent j = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(j);
                }

            }
        });

    }
}