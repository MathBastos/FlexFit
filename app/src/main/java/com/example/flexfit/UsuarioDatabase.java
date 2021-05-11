package com.example.flexfit;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class UsuarioDatabase extends SQLiteOpenHelper {

    private static final String name = "Flexfit.sqlite";
    private static final int version = 1;
    private static final String DB_TABLE = "Usuarios";


    private Context context;

    public UsuarioDatabase(Context context) {
        super(context, name, null, version);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       String query = "CREATE TABLE "+ DB_TABLE +"(usuario TEXT PRIMARY KEY, senha TEXT);";
       db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Usuarios");
        onCreate(db);
    }
    public long inserirUsuario(Usuario usuario){
        SQLiteDatabase database = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("usuario", usuario.getUsuario());
        values.put("senha", usuario.getSenha());
        long result = database.insert("Usuarios", null, values);
        return result;
    }

    public String checkUsuarioSenha(String usuario, String senha){
        SQLiteDatabase banco = getReadableDatabase();
        Cursor cursor = banco.rawQuery("SELECT * FROM usuarios WHERE usuario = ? AND senha = ?", new String[] {usuario, senha});
        if(cursor.getCount() > 0)
            return "OK";
        else
            return "ERRO";
    }

    public ArrayList<Usuario> retrieveUsuariosFromDB(){
        SQLiteDatabase database = getReadableDatabase();
        Cursor cursor = database.query(DB_TABLE,null,null,
                null,null,null,null);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        if(cursor.moveToFirst()){
            do{
                String usuario = cursor.getString(cursor.getColumnIndex("usuario"));
                String senha = cursor.getString(cursor.getColumnIndex("senha"));

                Usuario u = new Usuario(usuario, senha);
                usuarios.add(u);

            }while (cursor.moveToNext());
        }
        database.close();
        return usuarios;
    }
}
