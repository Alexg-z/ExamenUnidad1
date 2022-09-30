package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Escenario1 extends AppCompatActivity {

    EditText txDNI, txNombre, txCarrera;
    RadioButton rbtnH, rbtnM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenario1);

        txDNI = (EditText) findViewById(R.id.txDNI);
        txNombre = (EditText) findViewById(R.id.txNombre);
        txCarrera = (EditText) findViewById(R.id.txCarrera);

        rbtnH = (RadioButton) findViewById(R.id.rbtnH);
        rbtnM = (RadioButton) findViewById(R.id.rbtnM);
    }

    public void Guardar (View view) {
        String DNI = txDNI.getText().toString();
        String Nombre = txNombre.getText().toString();
        String Carrera = txCarrera.getText().toString();
        String Sexo = null;

        String pattern  = "[0-9]{8}[a-z]{1}";

        if (DNI.matches(pattern)){
            Toast.makeText(this, "Patron correcto", Toast.LENGTH_SHORT).show();
            if(rbtnH.isChecked()){
                Sexo = "Hombre";
            } if (rbtnM.isChecked()){
                Sexo = "Mujer";
            }

            String datos = "DNI: " + DNI + System.getProperty("line.separator") +
                    "Nombre: " + Nombre + System.getProperty("line.separator") +
                    "Carrera: " + Carrera + System.getProperty("line.separator") +
                    "Sexo: " + Sexo;

            SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
            SharedPreferences.Editor objeto_editor = preferences.edit();
            objeto_editor.putString(DNI,datos);
            objeto_editor.commit();

            Intent sig = new Intent(this,escenario1Resumen.class);
            sig.putExtra("dni",DNI);
            startActivity(sig);

            Toast.makeText(this, "Informacion guardada", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Patron DNI erroneo (00000000a)", Toast.LENGTH_SHORT).show();
        }

    }
}