package com.glauberhd.petcare;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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
    private Button btnCarrinhoMedicamentoAntiPulga;
    private TextView txtEnviarMedicamentoAntiPulga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento);
        //ação menu
        btnRacao02 = findViewById(R.id.btnIrParaTelaRacao02);
        btnAcessorio02 = findViewById(R.id.btnIrParaTelaAcessorio02);
        btnCarrinho02 = findViewById(R.id.btnIrParaTelaCarrinho02);
        //ação botao carrinho
        btnCarrinhoMedicamentoAntiPulga = findViewById(R.id.btnCarrinhoMedicamentoAntiPulga);
        txtEnviarMedicamentoAntiPulga = findViewById(R.id.txtEnviarMedicamentoAntiPulga);


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
    public void DialogueMedicamentoAntiPulga (View view){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle("Antipulgas Simparic 20 mg para cães 5,1 a 10 kg - Zoetis");
        dialog.setMessage(" " +
                "Indicado para cães de 5,1 a 10kg; \n" +
                "- Proteção contra Pulgas, Carrapatos, Sarnas; \n" +
                "- Comprimido mastigável; \n" +
                "- Indicado para cães de 8 semanas e peso acima de 1,3kg;\n" +
                "- Começa a agir rapidamente; \n" +
                "- Protege por 35 dias, \n" +
                "- Disponível em embalagens com 1 ou 3 tabletes mastigáveis de 20mg.Pet: Cachorros e Cachorros\n" +
                "Porte de Raça: Pequeno e Pequeno\n" +
                "Idade: Sênior, Adulto, Filhote, Sênior, Adulto e Filhote\n" +
                "Composição: Isoxazolina: Sarolaner e Isoxazolina: Sarolaner\n" +
                "Uso: Oral e Oral\n" +
                "Tipo: Antipulgas, Carrapatos e Sarnas, Antipulgas e Carrapatos e Sarnas\n" +
                "Apresentação: Embalagens com 1 ou 3 tabletes mastigáveis e Embalagens com 1 ou 3 tabletes mastigáveis"
        );
        dialog.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent5 = new Intent(MedicamentoActivity.this,CarrinhoActivity.class);
                intent5.putExtra("produto5",txtEnviarMedicamentoAntiPulga.getText().toString());
                startActivity(intent5);
            }
        });

        //dialog.setPositiveButton
        dialog.create();
        dialog.show();
    }
}
