package com.example.pasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nombre,telefono;
    Button btnPasar, btnPasarDatos;
    final static String TAG1="nombre", TAG2="telefono";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();


    }

    private void acciones() {
        btnPasar.setOnClickListener(this);
        btnPasarDatos.setOnClickListener(this);
    }

    private void instancias() {
        nombre = findViewById(R.id.nombre);
        telefono = findViewById(R.id.telefono);
        btnPasar = findViewById(R.id.btn1);
        btnPasarDatos = findViewById(R.id.btn2);
    }

    public void onClick(View view) {
        switch (view.getId()) {
           /* case R.id.btn1:
                String palabra = nombre.getText().toString();
                String numero = telefono.getText().toString();
                if (palabra.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Introduce datos", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(getApplicationContext(),palabra,Toast.LENGTH_SHORT).show();
                    //Para pasar a otra pantalla, es una accion
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                }

                break;*/
            case R.id.btn1:
                if(!nombre.getText().toString().isEmpty() && telefono.getText().toString().length()==9){
                    int telefonoRec = Integer.valueOf(telefono.getText().toString());
                    String nombreRec = nombre.getText().toString();
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    intent.putExtra(TAG1,nombreRec);
                    intent.putExtra(TAG2, telefonoRec);
                    startActivity(intent);
                }else{
                    Toast.makeText(getApplicationContext(), "Faltan cosas", Toast.LENGTH_SHORT).show();
                }

                break;
            case R.id.btn2:
                String palabraPasar = nombre.getText().toString();
                String numeroPasar = telefono.getText().toString();
                if (palabraPasar.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Introduce datos", Toast.LENGTH_SHORT).show();
                } else {
                    //Toast.makeText(getApplicationContext(),palabra,Toast.LENGTH_SHORT).show();
                    //Para pasar a otra pantalla, es una accion
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    //Para pasar el valor a la otra pantalla
                    intent.putExtra("k1", palabraPasar);
                    intent.putExtra("k2",numeroPasar);
                    startActivity(intent);

                    break;
                }
        }
    }
}
