package com.example.practica31;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonDate;
    EditText editTextDate;
    private int dia, mes,ano,hora,minutos;
    private EditText editTextNombre;
    private EditText editTextPhone;
    private EditText editTextEmailAddress;
    private EditText editTextTextMultiLine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // editText.setEnabled(false);
        buttonDate=(Button)findViewById(R.id.buttonDate);
        editTextDate=(EditText)findViewById(R.id.editTextDate);
        buttonDate.setOnClickListener(this);

        editTextNombre=(EditText)findViewById(R.id.editTextNombre);
        editTextPhone=(EditText)findViewById(R.id.editTextPhone);
        editTextEmailAddress=(EditText)findViewById(R.id.editTextEmailAddress);
        editTextTextMultiLine=(EditText)findViewById(R.id.editTextTextMultiLine);

    }

    @Override
    public void onClick(View view) {
            if(view==buttonDate){
                final Calendar c= Calendar.getInstance();
                dia=c.get(Calendar.DAY_OF_MONTH);
                mes=c.get(Calendar.MONTH);
                ano=c.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                       editTextDate.setText(dayOfMonth+"/"+(monthOfYear+1)+"/"+year);

                    }
                }
                ,dia,mes,ano);
                datePickerDialog.show();
            }
    }

    //Método Botón Siguiente
    public void Siguiente(View view){
        Intent i=new Intent(this,ConfirmarDatos.class);
        i.putExtra("nombre", editTextNombre.getText().toString());
        i.putExtra("fecha", editTextDate.getText().toString());
        i.putExtra("telefono", editTextPhone.getText().toString());
        i.putExtra("correo", editTextEmailAddress.getText().toString());
        i.putExtra("descripcion", editTextTextMultiLine.getText().toString());
        startActivity(i);
    }
}