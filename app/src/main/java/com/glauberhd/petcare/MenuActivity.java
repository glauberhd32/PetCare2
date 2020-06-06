package com.glauberhd.petcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private Button btnMedicamento;
    private Button btnRacao;
    private Button btnAcessorio;
    private Button btnCarrinho;
    private  Button btnRacaoCao;
    private Button btnRacaoGato;
    private Button btnRacaoPeixe;
    private Button btnRacaoPassaro;
    private TextView txtEviarRacaoCao;
    private TextView txtEviarRacaoGato;
    private TextView txtEnviarRacaoPeixe;
    private TextView txtEviarRacaoPassaro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // Botao menus
        btnMedicamento = findViewById(R.id.btnIrParaTelaMedicamento01);
        btnRacao = findViewById(R.id.btnIrParaTelaRacao01);
        btnAcessorio = findViewById(R.id.btnIrParaTelaAcessorio02);
        btnCarrinho = findViewById(R.id.btnIrParaTelaCarrinho01);
        //botoes Adicionar Carrinho
        btnRacaoCao = findViewById(R.id.btnCarrinhoRacaoCao);
        btnRacaoGato = findViewById(R.id.btnCarrinhoRacaoGato);
        btnRacaoPeixe = findViewById(R.id.btnCarrinhoRacaoPeixe);
        btnRacaoPassaro = findViewById(R.id.btnCarrinhoRacaoPassaro);
        //Envios de dados
        txtEviarRacaoCao =findViewById(R.id.txtEnviadoRacaoCao01);
        txtEviarRacaoGato =findViewById(R.id.txtEnviarRacaoGato);
        txtEnviarRacaoPeixe = findViewById(R.id.txtEnviadoRacaoPeixe);
        txtEviarRacaoPassaro = findViewById(R.id.txtEviarRacaoPassaro);


         // eventos de transição de tela
        btnMedicamento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,MedicamentoActivity.class));
            }
        });
        btnRacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,MenuActivity.class));
            }
        });
        btnAcessorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,AcessorioActivity.class));
            }
        });
        btnCarrinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MenuActivity.this,CarrinhoActivity.class));

          // eventos de transição de dados
            }
        });
        btnRacaoCao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent.putExtra("produto",txtEviarRacaoCao.getText().toString());
                Toast.makeText(getApplicationContext(),"Adicionado ao carrinho",Toast.LENGTH_LONG).show();
                startActivity(intent);


            }
        });

        btnRacaoGato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent2.putExtra("produto2",txtEviarRacaoGato.getText().toString());
                startActivity(intent2);

            }
        });
        btnRacaoPeixe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent3.putExtra("produto3",txtEnviarRacaoPeixe.getText().toString());
                startActivity(intent3);
            }
        });
        btnRacaoPassaro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MenuActivity.this,CarrinhoActivity.class);
                intent4.putExtra("produto4",txtEviarRacaoPassaro.getText().toString());
                startActivity(intent4);
            }
        });

    }
}
