package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsuario;
    private EditText editTextSenha;
    private UsuarioDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextUsuario = findViewById(R.id.editTextUsuario);
        editTextSenha = findViewById(R.id.editTextSenha);
        DataModel.getInstance().setContext(this);
        database = new UsuarioDatabase(this);
    }

    public void buttonCadastroOnClick(View view){
        Intent intentCadastro = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intentCadastro);
    }
    public void buttonLoginOnClick(View view){
        String usuario = editTextUsuario.getText().toString();
        String senha = editTextSenha.getText().toString();
        if (usuario.equals("")||senha.equals("")){
            Toast.makeText(this, "Favor preencher todos os campos", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Logado com sucesso", Toast.LENGTH_SHORT).show();
            Intent intentLogin = new Intent(MainActivity.this, TelaPrincipalActivity.class);
            startActivity(intentLogin);
        }
    }
}