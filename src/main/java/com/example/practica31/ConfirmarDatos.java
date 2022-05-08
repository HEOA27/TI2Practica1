package com.example.practica31;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {
    private TextView textViewDatos;
    private TextView textViewFecha;
    private  TextView textViewTelefono;
    private TextView textViewCorreo;
    private TextView textViewDescrip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        textViewDatos=(TextView)findViewById(R.id.textViewDatos);
        //alojar de manera temporal los datos que se envian
        String dato=getIntent().getStringExtra("nombre");
        textViewDatos.setText(dato);

        textViewFecha=(TextView)findViewById(R.id.textViewFecha);
        String dato2=getIntent().getStringExtra("fecha");
        textViewFecha.setText(dato2);

        textViewTelefono=(TextView)findViewById(R.id.textViewTelefono);
        String dato3=getIntent().getStringExtra("telefono");
        textViewTelefono.setText(dato3);

        textViewCorreo=(TextView)findViewById(R.id.textViewCorreo);
        String dato4=getIntent().getStringExtra("correo");
        textViewCorreo.setText(dato4);

        textViewDescrip=(TextView)findViewById(R.id.textViewDescrip);
        String dato5=getIntent().getStringExtra("descripcion");
        textViewDescrip.setText(dato5);

    }
    public void Editar(View view){
        Intent i =new Intent(this, MainActivity.class);
        finish();
        //startActivity(i);

    }
}

