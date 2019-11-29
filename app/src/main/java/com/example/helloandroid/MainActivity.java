package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtKullaniciEmail;
    EditText edtKullaniciParola;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtKullaniciEmail = findViewById(R.id.editTextMail);
        edtKullaniciParola = findViewById(R.id.editTextParola);
        btnLogin = findViewById(R.id.buttonLogin);

        final String strKullaniciMail = "ali@veli.com";
        final String strKullaniciParola = "murat";



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (strKullaniciMail.equals(edtKullaniciEmail.getText().toString().trim())){
                    if (strKullaniciParola.equals(edtKullaniciParola.getText().toString().trim())){
                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });



    }
}
