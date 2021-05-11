package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroActivity extends AppCompatActivity {

    EditText editTextUsuarioCadastro;
    EditText editTextSenhaCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        editTextUsuarioCadastro = findViewById(R.id.editTextUsuarioCadastro);
        editTextSenhaCadastro = findViewById(R.id.editTextSenhaCadastro);
    }

    public void buttonSalvarOnClick(View view){
        Intent intentSalvar = new Intent(CadastroActivity.this, MainActivity.class);
        startActivity(intentSalvar);
    }
}