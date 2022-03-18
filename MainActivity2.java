package com.example.tallervistaproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tvNombres;
    private TextView tvApellidos;
    private TextView tvEdad;
    private TextView tvDireccion;
    private TextView tvPeso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tvNombres=(TextView) findViewById(R.id.textView30);
        tvApellidos= (TextView) findViewById(R.id.textView31);
        tvEdad=(TextView)findViewById(R.id.textView33);
        tvDireccion=(TextView) findViewById(R.id.textView34);
        tvPeso=(TextView) findViewById(R.id.textView35);

        String dato = getIntent().getStringExtra("dato");
        tvNombres.setText(dato);
        String dato1 = getIntent().getStringExtra("dato1");
        tvApellidos.setText(dato1);
        String dato2 = getIntent().getStringExtra("dato2");
        tvEdad.setText(dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        tvDireccion.setText(dato3);
        String dato4 = getIntent().getStringExtra("dato4");
        tvPeso.setText(dato4);
    }

}