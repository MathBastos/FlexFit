package com.example.flexfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroActivity extends AppCompatActivity {

    private EditText editTextUsuarioCadastro;
    private EditText editTextSenhaCadastro;
    private UsuarioDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        editTextUsuarioCadastro = findViewById(R.id.editTextUsuarioCadastro);
        editTextSenhaCadastro = findViewById(R.id.editTextSenhaCadastro);
        database = new UsuarioDatabase(this);

    }

    public void buttonSalvarOnClick(View view){
        String usuario = editTextUsuarioCadastro.getText().toString();
        String senha= editTextSenhaCadastro.getText().toString();

        if(usuario.equals("")||senha.equals("")) {
            Toast.makeText(this, "Por favor preencher todos os campos", Toast.LENGTH_SHORT).show();
        }else{
                Usuario u = new Usuario();
                database.inserirUsuario(u);
                Toast.makeText(this, "Usuario inserido", Toast.LENGTH_SHORT).show();
                Intent intentSalvar = new Intent(CadastroActivity.this, MainActivity.class);
                startActivity(intentSalvar);
            }
    }

}
