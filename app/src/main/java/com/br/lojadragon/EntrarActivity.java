package com.br.lojadragon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class EntrarActivity extends AppCompatActivity {

    private Button btnCad, btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(
                        view,
                        "Sua mensagem aqui...",
                        Snackbar.LENGTH_INDEFINITE
                ).setAction("Fechar", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        btnLogin.setText("Login");
                    }
                }).show();

                Toast.makeText(
                        getApplicationContext(),
                        "Login confirmado",
                        Toast.LENGTH_LONG
                ).show();
            }
        });


    }

    public void cadastrar(View view){
        startActivity(new Intent(this, CadastrarActivity.class));
    }



}