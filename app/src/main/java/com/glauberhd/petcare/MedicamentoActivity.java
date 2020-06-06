package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MedicamentoActivity extends AppCompatActivity {
    private Button btnRacao02;
    private Button btnAcessorio02;
    private Button btnCarrinho02;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento);

        btnRacao02 = findViewById(R.id.btnIrParaTelaRacao02);
        btnAcessorio02 = findViewById(R.id.btnIrParaTelaAcessorio02);
        btnCarrinho02 = findViewById(R.id.btnIrParaTelaCarrinho02);



        btnRacao02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(  MedicamentoActivity.this,MenuActivity.class));
            }
        });
        btnAcessorio02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MedicamentoActivity.this,AcessorioActivity.class));
            }
        });
        btnCarrinho02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MedicamentoActivity.this,CarrinhoActivity.class));
            }
        });


    }
}
