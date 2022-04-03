package com.ilayda.destina;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity4 extends AppCompatActivity {

    private FirebaseAuth mAuth;
            private TextInputLayout inputEposta, inputSifre;
            private ConstraintLayout mLinear;
            private EditText editEposta, editSifre;
            private String txtEposta, txtSifre;
    Button girisEkraninaGitme;


    private void init(){
        mLinear=(ConstraintLayout)findViewById(R.id.giris_yap);
            mAuth = FirebaseAuth.getInstance();
            inputEposta= (TextInputLayout)findViewById(R.id.input_eposta);
            inputSifre=(TextInputLayout)findViewById(R.id.input_sifre);
            editEposta=(EditText)findViewById(R.id.edit_eposta);
            editSifre=(EditText)findViewById(R.id.edit_sifre);
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        init();

        girisEkraninaGitme=findViewById(R.id.button5);
        girisEkraninaGitme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity4.this,MainActivity2.class));
            }
        });



    }
    public void girisYap(View v){

        txtEposta=editEposta.getText().toString();
        txtSifre=editSifre.getText().toString();

        if (!TextUtils.isEmpty(txtEposta)){
            if (!TextUtils.isEmpty(txtSifre)){
            mAuth.signInWithEmailAndPassword(txtEposta,txtSifre)
                    .addOnCompleteListener(MainActivity4.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(MainActivity4.this, "Başarıyla Giriş Yaptınız.", Toast.LENGTH_SHORT).show();
                                finish();
                                startActivity(new Intent(MainActivity4.this,MainActivity5.class).setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP));
                            }else
                                Snackbar.make(mLinear,task.getException().getMessage(), Snackbar.LENGTH_SHORT).show();
                        }
                    });
            }else
                inputSifre.setError("Lütfen Geçerli Bir Şifre Giriniz.");
        }else
            inputEposta.setError("Lütfen Geçerli Bir E-Posta Giriniz.");


    }
}