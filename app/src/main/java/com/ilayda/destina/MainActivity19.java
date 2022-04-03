package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity19 extends AppCompatActivity {
    Button oglakGeriGitmeButonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        oglakGeriGitmeButonu=findViewById(R.id.oglakGeriButonu);
        oglakGeriGitmeButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity19.this,MainActivity7.class));
            }
        });
    }
}