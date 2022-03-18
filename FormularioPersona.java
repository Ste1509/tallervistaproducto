package com.example.tallervistaproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FormularioPersona extends AppCompatActivity {

    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2;
    private EditText editTextTextPersonName4;
    private EditText editTextTextPersonName5;
    private EditText editTextTextPersonName7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_persona);
        //Comunicar
        editTextTextPersonName = (EditText) findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = (EditText) findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName4 = (EditText) findViewById(R.id.editTextTextPersonName4);
        editTextTextPersonName5 = (EditText) findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName7 = (EditText) findViewById(R.id.editTextTextPersonName7);
    }
    // Método para el botón Guardar
    public void Guardar(View view){
        android.content.Intent i =  new android.content.Intent(this, MainActivity2.class);
        i.putExtra("dato", editTextTextPersonName.getText().toString());
        i.putExtra("dato1", editTextTextPersonName2.getText().toString());
        i.putExtra("dat2", editTextTextPersonName4.getText().toString());
        i.putExtra("dato3", editTextTextPersonName5.getText().toString());
        i.putExtra("dato4", editTextTextPersonName7.getText().toString());
        startActivity(i);
    }

}