package com.example.porcentagem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

import java.text.DecimalFormat;

public class PORCENTAGEM extends AppCompatActivity {

    private EditText editQuantidadePor;
    private TextView textResultado;
    private TextView textResultado1;
    private TextView textResultado2;
    private TextView textResultado3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editQuantidadePor   = findViewById(R.id.editQuantidadePor);
        textResultado       = findViewById(R.id.textResultado);
        textResultado1      = findViewById(R.id.textResultado1);
        textResultado2      = findViewById(R.id.textResultado2);
        textResultado3      = findViewById(R.id.textResultado3);


    }
    public void converter(View view){

        DecimalFormat df = new DecimalFormat("#0.00");

        double valor =  50.0/100.0;
        double valor1 = 30.0/100.0;
        double valor2 = 10.0/100.0;
        double valor3 = 10.0/100.0;
        double porcentagem = Double.parseDouble(editQuantidadePor.getText().toString());

        double resultadoo =  valor * porcentagem;
        double resultadoo1 = valor1 * porcentagem;
        double resultadoo2 = valor2 * porcentagem;
        double resultadoo3 = valor3 * porcentagem;

        textResultado.setText (" 50% Essenciais:          R$ " + df.format(resultadoo)    );
        textResultado1.setText(" 30% Investimentos:    R$ " + df.format(resultadoo1)   );
        textResultado2.setText(" 10% Não Essenciais:  R$ " + df.format(resultadoo2)   );
        textResultado3.setText(" 10% Torrar:                   R$ " + df.format(resultadoo3)   );




    }
}