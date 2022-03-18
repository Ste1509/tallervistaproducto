package com.example.tallervistaproducto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentAttributes();
        saludo.setText("HOOLA EGUIPO");


    }

    private void setContentAttributes(){
        saludo = findViewById(R.id.textView3);
    }
}