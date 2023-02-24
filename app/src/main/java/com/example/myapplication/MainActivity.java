package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton compaq, sony, dell;
    private CheckBox escritorio, scanner, impresora;
    private RadioGroup groupbox;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        groupbox = (RadioGroup) findViewById(R.id.groupBox);
        escritorio = (CheckBox) findViewById(R.id.escritorio);
        scanner = (CheckBox) findViewById(R.id.scanner);
        impresora = (CheckBox) findViewById(R.id.impresora);
        total = (TextView) findViewById(R.id.total);
        compaq = findViewById(R.id.compaq);
        sony = findViewById(R.id.sony);
        dell = findViewById(R.id.dell);

    }

    public void calcularCompra (View view){
        int precio = 0;
        if (compaq.isChecked()){
            precio = 1500000;
        } else if (sony.isChecked()) {
            precio = 500000;
        } else if (dell.isChecked()) {
            precio= 2000000;
        }
        if (escritorio.isChecked() == true){
            precio += 200000;
        }
        if (scanner.isChecked() == true){
            precio += 150000;
        }
        if (impresora.isChecked() == true){
            precio += 250000;
        }
       total.setText(String.valueOf(precio));

    }
}