package com.example.pasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        recuperarDatos();
    }

    //Me coge el string de la otra pantalla que estaba en el intent con esa clave
   /* public void recuperarDatos(){
        String palabraRecuperada = getIntent().getExtras().get("k1").toString();
        texto.setText(palabraRecuperada);
    }*/

    public void recuperarDatos() {
        if (getIntent().getExtras() != null) {
            String nombre = getIntent().getExtras().get(MainActivity.TAG1).toString();
            int telefono = Integer.valueOf(getIntent().getExtras().get(MainActivity.TAG2).toString());
            String saludo = String.format("%s %s %s %d %s", getResources().getString(R.string.app_enorabuena),
                    nombre, getResources().getString(R.string.app_telefono), telefono, getResources().getString(R.string.app_ok));
            texto.setText(saludo);
        }
    }

    public void instancias() {
        texto = findViewById(R.id.textoRec);
    }
}
