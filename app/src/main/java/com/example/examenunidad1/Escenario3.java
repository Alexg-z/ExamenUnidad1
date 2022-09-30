package com.example.examenunidad1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Escenario3 extends AppCompatActivity {

    TextView etSumados,txInversa;
    EditText txDigito;

    int numero, invertido = 0, resto, resultado = 0, sum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escenario3);

        etSumados = (TextView) findViewById(R.id.etSumados);
        txDigito = (EditText) findViewById(R.id.txtDigito);
        txInversa = (TextView) findViewById(R.id.txtInvertidos);

    }

    public void invertir (View view) {

        String valor = txDigito.getText().toString();
        numero = Integer.parseInt(valor);

        /* Invertir numeros*/
        while ( numero > 0 ) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero /= 10;
        }

        String valores = String.valueOf(invertido);
        txInversa.setText(valores);

        /* Suma de digito */
        sum = invertido;

        while (sum > 0) {
            resultado += sum % 10;
            sum = sum / 10;
        }

        String valoressumados = String.valueOf(resultado);
        etSumados.setText("Suma: " + valoressumados);

    }

}