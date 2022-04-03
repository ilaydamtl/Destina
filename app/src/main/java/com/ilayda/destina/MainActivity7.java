package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button burclarinYiliGeri;
    Button kocBurcu;
    Button bogaBurcu;
    Button ikizlerBurcu;
    Button yengecBurcu;
    Button aslanBurcu;
    Button basakBurcu;
    Button teraziBurcu;
    Button akrepBurcu;
    Button yayBurcu;
    Button oglakBurcu;
    Button kovaBurcu;
    Button balikBurcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        kocBurcu=findViewById(R.id.kocButon);
        kocBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity10.class));
            }
        });

        bogaBurcu=findViewById(R.id.bogaButon);
        bogaBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity11.class));
            }
        });

        ikizlerBurcu=findViewById(R.id.ikizlerButon);
        ikizlerBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity12.class));
            }
        });

        yengecBurcu=findViewById(R.id.yengecButon);
        yengecBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity13.class));
            }
        });

        aslanBurcu=findViewById(R.id.aslanButon);
        aslanBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity14.class));
            }
        });

        basakBurcu=findViewById(R.id.basakButon);
        basakBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity15.class));
            }
        });

        teraziBurcu=findViewById(R.id.teraziButon);
        teraziBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity16.class));
            }
        });

        akrepBurcu=findViewById(R.id.akrepButon);
        akrepBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity17.class));
            }
        });

        yayBurcu=findViewById(R.id.yayButon);
        yayBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity18.class));
            }
        });

        oglakBurcu=findViewById(R.id.oglakButon);
        oglakBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity19.class));
            }
        });

        kovaBurcu=findViewById(R.id.kovaButon);
        kovaBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity20.class));
            }
        });

        balikBurcu=findViewById(R.id.balikButon);
        balikBurcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity21.class));
            }
        });

        burclarinYiliGeri=findViewById(R.id.burclarGeriButonu);
        burclarinYiliGeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity5.class));
            }
        });
    }
}