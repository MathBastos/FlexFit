package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipalActivity extends AppCompatActivity {

    Button buttonTreinar;
    Button buttonResultados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        buttonTreinar = findViewById(R.id.buttonTreinar);
        buttonTreinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTreinar = new Intent(TelaPrincipalActivity.this, TreinarActivity.class);
                startActivity(intentTreinar);
            }
        });
        buttonResultados = findViewById(R.id.buttonResultados);
        buttonResultados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResultados = new Intent(TelaPrincipalActivity.this, ResultadosActivity.class);
                startActivity(intentResultados);
            }
        });
    }
}