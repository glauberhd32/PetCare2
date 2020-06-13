package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CarrinhoActivity extends AppCompatActivity {
    private Button btnRacao04;
    private Button  btnMedicamento04;
    private Button btnAcessorio;
    private TextView txtRecebidoRacaoCao01;
    private TextView txtRecebidoRacaoGato01;
    private TextView txtRecebidoRacaoPeixe01;
    private TextView txtRecebidoRacaoPassaro01;
    private TextView txtRecebidoMedicamentoAntiPulga01;
    private Button botaoFinalizar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
        //botao Menus
        btnRacao04 = findViewById(R.id.btnIrParaTelaRacao04);
        btnMedicamento04 = findViewById(R.id.btnIrParaTelaMedicamento04);
        btnAcessorio = findViewById(R.id.btnIrParaTelaAcessorio04);
        botaoFinalizar = findViewById(R.id.botaoFinalizar);

         //racao cao recebida
        txtRecebidoRacaoCao01 = findViewById(R.id.txtRecebidoRacaoCao);
        String receberIntent = getIntent().getStringExtra("produto");
        txtRecebidoRacaoCao01.setText(receberIntent);
        //racao gato recebida
        txtRecebidoRacaoGato01 = findViewById(R.id.txtRecebidoRacaoGato);
        String receberIntent2 = getIntent().getStringExtra("produto2");
        txtRecebidoRacaoGato01.setText(receberIntent2);
        //racao peixe recebida
        txtRecebidoRacaoPeixe01 =findViewById(R.id.txtRecebidoRacaoPeixe);
        String receberIntent3 = getIntent().getStringExtra("produto3");
        txtRecebidoRacaoPeixe01.setText(receberIntent3);
        //racao passaro recebida
        txtRecebidoRacaoPassaro01 = findViewById(R.id.txtRecebidoRacaoPassaro);
        String receberIntent4 = getIntent().getStringExtra("produto4");
        txtRecebidoRacaoPassaro01.setText(receberIntent4);
        //medicamento antipulga recebido
        txtRecebidoMedicamentoAntiPulga01 = findViewById(R.id.txtRecebidoMedicamentoAntiPulga);
        String receberIntent5 = getIntent().getStringExtra("produto5");
        txtRecebidoMedicamentoAntiPulga01.setText(receberIntent5);



        // Transição das activity atravez dos botoes
        btnRacao04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CarrinhoActivity.this,MenuActivity.class));
            }
        });
        btnMedicamento04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CarrinhoActivity.this,MedicamentoActivity.class));
            }
        });
        btnAcessorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CarrinhoActivity.this,AcessorioActivity.class));
            }
        });

        botaoFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CarrinhoActivity.this,FinalizarCompraActivity.class));
            Toast.makeText(getApplicationContext(),"Compra finalizada" ,Toast.LENGTH_LONG).show();
            }
        });


    }
}
