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
    public void recuperarDatos(){
        String palabraRecuperada = getIntent().getExtras().get("k1").toString();
        texto.setText(palabraRecuperada);
    }

    public void instancias(){
        texto = findViewById(R.id.textoRecuperado);
    }
}
