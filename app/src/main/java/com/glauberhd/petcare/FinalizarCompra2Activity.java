package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FinalizarCompra2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra2);
    }
    public void FinalizarPedido(View view ){
        Toast.makeText(getApplicationContext(),"Compra finalizada com  sucesso",Toast.LENGTH_LONG).show();
    }
}
