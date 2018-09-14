package com.example.brunomarques.combustivel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText Alcool;
    EditText Gasolina;
    TextView Resultado;
    Button BtnCalcular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Alcool =(EditText) findViewById(R.id.TbxAlcool);
        Gasolina = (EditText) findViewById(R.id.TbxGasolina);
        Resultado = (TextView) findViewById(R.id.LblResult);
        BtnCalcular = (Button) findViewById(R.id.BtnCalcular);

        BtnCalcular.setOnClickListener(this);
    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.BtnCalcular){
            if(Alcool.getText().toString().trim().equals("")||Gasolina.getText().toString().trim().equals("")){

            }else{
                double AlcoolNumber = Double.valueOf(Alcool.getText().toString());
                double GasolinaNumber = Double.valueOf(Gasolina.getText().toString());

                if((AlcoolNumber/GasolinaNumber) < 0.7){
                    Resultado.setText("Compensa colocar: Alcool");
                }else{
                    Resultado.setText("Compensa colocar: Gasolina");
                }
            }

        }
    }
}