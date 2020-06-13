package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FinalizarCompraActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_compra);
    }
    public void irParaTelaCompra(View view){
        startActivity(new Intent(FinalizarCompraActivity.this,FinalizarCompra2Activity.class));
    }
}
