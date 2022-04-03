package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {
    Button yengecGeriDönmeButonu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        yengecGeriDönmeButonu=findViewById(R.id.yengecGeriButonu);
        yengecGeriDönmeButonu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity13.this,MainActivity7.class));
            }
        });
    }
}