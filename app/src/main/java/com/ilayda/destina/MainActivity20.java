package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity20 extends AppCompatActivity {
    Button kovaGeriGitmeButonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        kovaGeriGitmeButonu=findViewById(R.id.kovaGeriButonu);
        kovaGeriGitmeButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity20.this,MainActivity7.class));
            }
        });
    }
}