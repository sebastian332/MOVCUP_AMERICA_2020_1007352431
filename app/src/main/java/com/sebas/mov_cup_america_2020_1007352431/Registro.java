package com.sebas.mov_cup_america_2020_1007352431;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sebas.mov_cup_america_2020_1007352431.model.Usuario;

public class Registro extends AppCompatActivity {
EditText edtNombre, edtcontra, edtcontra2, edtcorreo;
Button boGuardar;
Usuario usuario;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        comenzarView();
    }
    private void comenzarView (){
        edtNombre=findViewById(R.id.etUsuario);
        edtcontra=findViewById(R.id.etcontra);
        edtcontra2=findViewById(R.id.etcontra2);
        edtcorreo=findViewById(R.id.etcorreo);

        boGuardar=findViewById(R.id.boGuardar);
        usuario=new Usuario();
    }
    public  void onGuardarUser (View view){
        usuario.setUsuario(edtNombre.getText().toString());
        usuario.setContra(edtcontra.getText().toString());
        usuario.setContra2(edtcontra2.getText().toString());
        usuario.setCorreo(edtcorreo.getText().toString());
        Toast.makeText(this, "Usuario: "+usuario.getUsuario()+" Contraseña "+usuario.getContra(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Opciones.class);
        startActivity(intent);
    }
}
