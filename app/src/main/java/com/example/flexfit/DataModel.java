package com.example.flexfit;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;

public class DataModel {
    private static DataModel instance = new DataModel();
    private DataModel(){

    }

    public static DataModel getInstance(){
        return instance;
    }

    private UsuarioDatabase database;
    private ArrayList<Usuario> usuarios;
    private Context context;

    public void setContext(Context context){
        this.context = context;
        database = new UsuarioDatabase(context);
        usuarios = database.retrieveUsuariosFromDB();
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
}
