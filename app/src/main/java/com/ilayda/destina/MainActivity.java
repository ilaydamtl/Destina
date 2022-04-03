package com.ilayda.destina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imgGorsel;
    private static int GECİS_SURESİ = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tanımlamalar
        imgGorsel = (ImageView) findViewById(R.id.imgGorsel);
        //animasyon
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        imgGorsel.startAnimation(animation);
        //geçiş
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent gecis = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(gecis);
                finish();
            }

        },GECİS_SURESİ);
    }
}