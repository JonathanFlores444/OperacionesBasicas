package com.jafa.operacionesbasicas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Variables globales que representan sus variables del frontend
    EditText edNumero1, edNumero2;
    TextView tvResulado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //guardar las instancias de los estados del ciclo de vida de una actiidad
        super.onCreate(savedInstanceState);
        //relacoonando la actividad(backend)con un layout(frontend)
        setContentView(R.layout.activity_main);
        //comunicancod las variables del backend con los objetos logicos en el frontend
        edNumero1=findViewById(R.id.txtNum1);
        edNumero2=findViewById(R.id.txtNum2);
        tvResulado.findViewById(R.id.lblResultado);
    }
    public void sumar(View v){
        double num1=Double.parseDouble(edNumero1.getText().toString());
        int num2=Integer.parseInt(edNumero2.getText().toString());
        double resultado = num1+num2;
        tvResulado.setText(resultado+"");
    }
}