package com.sebas.mov_cup_america_2020_1007352431;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etUsuario, etContra;
    Button boAcceder, boRegistrar;
    String usuario, contraseña;
    String nombre, contra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsuario=findViewById(R.id.mainEdtUsuario);
        etContra=findViewById(R.id.mainEdtContr);
        boAcceder=findViewById(R.id.mainBtnAcceder);
        boRegistrar=findViewById(R.id.mainBtnRegistrarse);

        nombre="sebas";
        contra="123";

        boAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (etUsuario.getText().toString().equals(nombre) && etContra.getText().toString().equals(contra)){
                    Toast.makeText(MainActivity.this, "Bienvenido "+nombre, Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(MainActivity.this,Opciones.class);
                    startActivity(i);

                }else {
                    Toast.makeText(MainActivity.this, "Verificar Datos", Toast.LENGTH_SHORT).show();
                }

            }
        });
        boRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Registro.class);
                startActivity(intent);
            }
        });
    }
}
