package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonCadastroOnClick(View view){
        Intent intentCadastro = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intentCadastro);
    }
    public void buttonLoginOnClick(View view){
        Intent intentLogin = new Intent(MainActivity.this, TelaPrincipalActivity.class);
        startActivity(intentLogin);
    }
}