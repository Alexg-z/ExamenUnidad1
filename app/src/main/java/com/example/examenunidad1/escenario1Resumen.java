package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class escenario1Resumen extends AppCompatActivity {

    TextView etDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenario1_resumen);

        etDatos = (TextView) findViewById(R.id.etxDatos);

        String dni;

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        dni = getIntent().getStringExtra("dni");
        String datos = preferences.getString(dni, "");

        etDatos.setText(datos);
    }
}