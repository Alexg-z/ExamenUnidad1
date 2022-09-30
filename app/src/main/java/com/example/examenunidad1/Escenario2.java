package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Escenario2 extends AppCompatActivity {

    Button btnSum, btnRes, btnRe;
    CheckBox chNeg;
    TextView etNum;

    int numero = 0;
    String valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenario2);

        btnSum = (Button) findViewById(R.id.btnSuma);
        btnRes = (Button) findViewById(R.id.btnResta);
        btnRe = (Button) findViewById(R.id.btnReset);

        chNeg = (CheckBox) findViewById(R.id.chNegativos);

        etNum = (TextView) findViewById(R.id.etNumero);

        SharedPreferences preferences = getSharedPreferences("datos",Context.MODE_PRIVATE);
        valor = preferences.getString("valor","");

        etNum.setText(valor);
        numero = Integer.parseInt(valor);

    }

    public void sumar (View view) {

        int suma = numero + 1;
        numero = suma;

        valor = String.valueOf(suma);

        etNum.setText(valor);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit();
        obj_editor.putString("valor",valor);
        obj_editor.commit();
    }

    public void resta (View view) {

        if (numero > 0) {
            int resta = numero - 1;
            numero = resta;
            valor = String.valueOf(resta);
            etNum.setText(valor);

        }
        if(numero <= 0 && chNeg.isChecked()){
            int resta = numero - 1;
            numero = resta;
            valor = String.valueOf(resta);
            etNum.setText(valor);

        }

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit();
        obj_editor.putString("valor",valor);
        obj_editor.commit();
    }

    public void reset (View view) {
        numero = 0;
        valor = String.valueOf(numero);

        etNum.setText(valor);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferences.edit();
        obj_editor.putString("valor",valor);
        obj_editor.commit();

    }

}