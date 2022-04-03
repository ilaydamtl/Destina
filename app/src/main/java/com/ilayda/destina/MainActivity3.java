package com.ilayda.destina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity3 extends AppCompatActivity {

    private EditText editEmail, editSifre;
    private String txtEmail, txtSifre;
    private FirebaseAuth mAuth;
            Button girisEkranınaDonme;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editEmail=(EditText)findViewById(R.id.editTextTextPersonName3);
        editSifre=(EditText)findViewById(R.id.editTextTextPersonName4);
        mAuth=FirebaseAuth.getInstance();


        girisEkranınaDonme=findViewById(R.id.button4);
        girisEkranınaDonme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this,MainActivity2.class));
            }
        });



    }
    public void kayitOl (View v){
        txtEmail = editEmail.getText().toString();
        txtSifre = editSifre.getText().toString();
        if (!TextUtils.isEmpty(txtEmail) && !TextUtils.isEmpty(txtSifre)) {

            mAuth.createUserWithEmailAndPassword(txtEmail, txtSifre)
                    .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful())
                                Toast.makeText(MainActivity3.this, "Kayıt İşlemi Başarılı.", Toast.LENGTH_SHORT).show();
                            else
                                Toast.makeText(MainActivity3.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });


        } else
            Toast.makeText(this, "E-posta ve Şifre boş olamaz.", Toast.LENGTH_SHORT).show();
    }
}