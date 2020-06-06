package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcessorioActivity extends AppCompatActivity {
    private Button  btnRacao03;
    private Button btnMedicamento03;
    private Button btnCarrinho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acessorio);

        btnRacao03 = findViewById(R.id.btnIrParaTelaRacao03);
        btnMedicamento03 = findViewById(R.id.btnIrParaTelaMedicamento03);
        btnCarrinho = findViewById(R.id.btnIrParaTelaCarrinho03);

        btnRacao03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AcessorioActivity.this,MenuActivity.class));
            }
        });
        btnMedicamento03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AcessorioActivity.this,MedicamentoActivity.class));
            }
        });
        btnCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AcessorioActivity.this,CarrinhoActivity.class));
            }
        });
    }
}
